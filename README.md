# BuildItBigger
Udacity nanodegree project p4

##Overview

This project uses a java library that has jokes, an android library to provide the activity to display, a gce module to provide jokes 
which is queried using an async task and sent to the android library using an intent extra to be displayed. It has a test for the async 
task

##Rubric for evaluation 

* Project contains a Java library for supplying jokes.
* Project contains an Android library with an activity that displays jokes passed to it as intent extras.
* Project contains a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads jokes from GCE module via an AsyncTask.
* Project contains connected tests to verify that the AsyncTask is indeed loading jokes.
* Project contains paid/free flavors. The paid flavor has no ads and no unnecessary dependencies.
* App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library.

##Screenshots

###Main Screen

![screenshot_20161215-111424](https://cloud.githubusercontent.com/assets/19944703/21214564/7c2e447c-c2c1-11e6-92da-e9d78742d46a.png)


###Details Screen

![screenshot_20161215-111411](https://cloud.githubusercontent.com/assets/19944703/21214566/7dc5d7b4-c2c1-11e6-8b12-32a28b9dae55.png)

