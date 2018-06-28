package com.kang.pointenter;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by Kang on 2018/6/28.
 */
public class AccessKangService extends AccessibilityService {

    @Override
    protected void onServiceConnected() {
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        final int eventType = event.getEventType();
        String eventText = null;
        switch(eventType) {
            case AccessibilityEvent.TYPE_VIEW_CLICKED:
                eventText = "Clicked: ";
                break;
            case AccessibilityEvent.TYPE_VIEW_FOCUSED:
                eventText = "Focused: ";
                break;
        }

        eventText = eventText + event.getContentDescription();
        Log.e("kang","eventText:"+eventText);
        Log.e("kang", "eventType:"+eventType);
    }

    @Override
    public void onInterrupt() {
        Log.e("kang","Class---AccessKangService---Method---onInterrupt---:");
    }

}
