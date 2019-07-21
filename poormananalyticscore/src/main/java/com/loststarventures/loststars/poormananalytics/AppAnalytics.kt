package com.loststarventures.loststars.poormananalytics

interface AppAnalytics {

    fun setApplicationID(appID: Long);
    fun setDeviceID(deviceID: Long);
    fun sendEvent(eventName: String, flow: Int);

}