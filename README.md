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

##License
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

Copyright 2016 Nikhil Bhaskar

