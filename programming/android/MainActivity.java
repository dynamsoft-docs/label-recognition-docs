package com.example.dlrandroidsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

import com.dynamsoft.dlr.*;

public class MainActivity extends AppCompatActivity {
    // Click to take a photo
    private Button btnCapture;
    // Click to recognize thext
    private Button btnRecognize;
    // Display the photo taken with Camera App
    private ImageView imgView;
    // Display the recognition results
    private TextView txtView;

    // Uri of the captured photo
    private Uri imgUri;
    // The full path of the captured photo
    private String imgPath;

    private static final int Image_Capture_Code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCapture =(Button)findViewById(R.id.btnCapture);
        btnRecognize =(Button)findViewById(R.id.btnRecognize);
        imgView = (ImageView)findViewById(R.id.imgView);
        txtView = (TextView)findViewById(R.id.txtView);

        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // take a photo with Camera App
                takePhoto();
            }
        });

        btnRecognize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // recognize text in the photo
                recognizeText();
            }
        });
    }

    private void recognizeText() {
        try {
            LabelRecognition dlr = new LabelRecognition();

            DMLTSConnectionParameters licenseInfo = new DMLTSConnectionParameters();

            licenseInfo.organizationID = "200005";
            dlr.initLicenseFromLTS(licenseInfo, new DLRLTSLicenseVerificationListener() {
                @Override
                public void LTSLicenseVerificationCallback(boolean isSuccess, Exception error) {
                    if(!isSuccess){
                        error.printStackTrace();
                    }
                }
            });

            DLRResult[] results = dlr.recognizeByFile(imgPath, "");

            if (results != null && results.length > 0) {
                String strCurResult = "";
                for (int i = 0; i < results.length; i++) {
                    // Get result of each text area (also called label).
                    DLRResult result = results[i];
                    strCurResult += "Result " + i + ":\n";
                    for (int j = 0; j < result.lineResults.length; j++) {
                        // Get the result of each text line in the label.
                        DLRLineResult lineResult = result.lineResults[j];
                        strCurResult += ">>Line Result " + j + ": " + lineResult.text + "\n";
                    }
                }
                txtView.setText(strCurResult);
            } else {
                txtView.setText("No data detected.");
            }
        } catch (LabelRecognitionException e) {
            e.printStackTrace();
        }
    }

    private void takePhoto() {
        String status= Environment.getExternalStorageState();
        if(status.equals(Environment.MEDIA_MOUNTED)) {
            try {
                File outputImage = new File(getExternalCacheDir(), "output_image.jpg");
                imgPath = outputImage.getAbsolutePath();

                if (outputImage.exists()) {
                    outputImage.delete();
                }
                outputImage.createNewFile();

                if (Build.VERSION.SDK_INT >= 24) {
                    imgUri = FileProvider.getUriForFile(this, "com.example.dlrandroidsample", outputImage);
                } else {
                    imgUri = Uri.fromFile(outputImage);
                }

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, imgUri);
                startActivityForResult(intent, Image_Capture_Code);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == Image_Capture_Code && resultCode == RESULT_OK) {
            try {
                Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(imgUri));
                imgView.setImageBitmap(bitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}