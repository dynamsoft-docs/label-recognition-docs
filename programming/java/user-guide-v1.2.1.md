---
layout: default-layout
title: Java User Guide - Dynamsoft Label Recognition
description: This is the user guide page of Dynamsoft Label Recognition for Java Language.
keywords: java, user guide
needAutoGenerateSidebar: true
---

# Dynamsoft Label Recognition - Java User Guide

## System Requirements

- Operating systems:
   - Windows 7, 8, 10
   - Windows Server 2003, 2008, 2008 R2, 2012
   - Linux x64 (Ubuntu 14.04.4+ LTS, Debian 8+, etc.)
   - JDK 1.7 and above

## Installation

Download the Dynamsoft Label Recognition SDK from the [Dynamsoft website](https://www.dynamsoft.com/label-recognition/downloads) and unzip the package. The package includes a free trial license valid for 30 days.

## Getting Started: Hello World

1. Open Eclipse and create a new Java project HelloDLR.

2. Add the required JAR file to your project.
    Click File > Properties > Java Build Path > Libraries > Add external JARs, add dynamsoft-labelrecognition-{version number}.jar and click Apply.
    The JAR file can be found at `dlr-java-{version number}\DynamsoftLabelRecognition\lib`.

3. Import the package.
    ```java
    import com.dynamsoft.dlr.*;
    ```
    
4. Replace the code of HelloDLR with the following.
    ```java
    public class HelloDLR {
        public static void main(String[] args) {
            try {
                LabelRecognition dlr = new LabelRecognition();
                dlr.initLicense("<Put your license key here>");
                
                String file = "<your image file full path>";
                DLRResult[] results = dlr.recognizeByFile(file, "");
                
                if (results != null && results.length > 0) {
                    String strCurResult = "";
                    for (int i = 0; i < results.length; i++) {
                        strCurResult += "[" + i + "] :\n";
                        for (int j = 0; j < results[i].lineResults.length; j++) {
                            strCurResult += results[i].lineResults[j].text + "\n";
                        }
                    }
                    System.out.println(strCurResult);
                } else {
                    System.out.println("No results returned.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    ```
    Please update `<your image file full path>` and `<Put your license key here>` in the code accordingly.
5. Run the project


&nbsp; 
