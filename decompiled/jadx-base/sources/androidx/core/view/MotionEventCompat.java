package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class MotionEventCompat {

    @java.lang.Deprecated
    public static final int ACTION_HOVER_ENTER = 9;

    @java.lang.Deprecated
    public static final int ACTION_HOVER_EXIT = 10;

    @java.lang.Deprecated
    public static final int ACTION_HOVER_MOVE = 7;

    @java.lang.Deprecated
    public static final int ACTION_MASK = 255;

    @java.lang.Deprecated
    public static final int ACTION_POINTER_DOWN = 5;

    @java.lang.Deprecated
    public static final int ACTION_POINTER_INDEX_MASK = 65280;

    @java.lang.Deprecated
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;

    @java.lang.Deprecated
    public static final int ACTION_POINTER_UP = 6;

    @java.lang.Deprecated
    public static final int ACTION_SCROLL = 8;

    @java.lang.Deprecated
    public static final int AXIS_BRAKE = 23;

    @java.lang.Deprecated
    public static final int AXIS_DISTANCE = 24;

    @java.lang.Deprecated
    public static final int AXIS_GAS = 22;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_1 = 32;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_10 = 41;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_11 = 42;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_12 = 43;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_13 = 44;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_14 = 45;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_15 = 46;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_16 = 47;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_2 = 33;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_3 = 34;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_4 = 35;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_5 = 36;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_6 = 37;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_7 = 38;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_8 = 39;

    @java.lang.Deprecated
    public static final int AXIS_GENERIC_9 = 40;

    @java.lang.Deprecated
    public static final int AXIS_HAT_X = 15;

    @java.lang.Deprecated
    public static final int AXIS_HAT_Y = 16;

    @java.lang.Deprecated
    public static final int AXIS_HSCROLL = 10;

    @java.lang.Deprecated
    public static final int AXIS_LTRIGGER = 17;

    @java.lang.Deprecated
    public static final int AXIS_ORIENTATION = 8;

    @java.lang.Deprecated
    public static final int AXIS_PRESSURE = 2;
    public static final int AXIS_RELATIVE_X = 27;
    public static final int AXIS_RELATIVE_Y = 28;

    @java.lang.Deprecated
    public static final int AXIS_RTRIGGER = 18;

    @java.lang.Deprecated
    public static final int AXIS_RUDDER = 20;

    @java.lang.Deprecated
    public static final int AXIS_RX = 12;

    @java.lang.Deprecated
    public static final int AXIS_RY = 13;

    @java.lang.Deprecated
    public static final int AXIS_RZ = 14;
    public static final int AXIS_SCROLL = 26;

    @java.lang.Deprecated
    public static final int AXIS_SIZE = 3;

    @java.lang.Deprecated
    public static final int AXIS_THROTTLE = 19;

    @java.lang.Deprecated
    public static final int AXIS_TILT = 25;

    @java.lang.Deprecated
    public static final int AXIS_TOOL_MAJOR = 6;

    @java.lang.Deprecated
    public static final int AXIS_TOOL_MINOR = 7;

    @java.lang.Deprecated
    public static final int AXIS_TOUCH_MAJOR = 4;

    @java.lang.Deprecated
    public static final int AXIS_TOUCH_MINOR = 5;

    @java.lang.Deprecated
    public static final int AXIS_VSCROLL = 9;

    @java.lang.Deprecated
    public static final int AXIS_WHEEL = 21;

    @java.lang.Deprecated
    public static final int AXIS_X = 0;

    @java.lang.Deprecated
    public static final int AXIS_Y = 1;

    @java.lang.Deprecated
    public static final int AXIS_Z = 11;

    @java.lang.Deprecated
    public static final int BUTTON_PRIMARY = 1;

    @java.lang.Deprecated
    public static int getActionMasked(android.view.MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @java.lang.Deprecated
    public static int getActionIndex(android.view.MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @java.lang.Deprecated
    public static int findPointerIndex(android.view.MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @java.lang.Deprecated
    public static int getPointerId(android.view.MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @java.lang.Deprecated
    public static float getX(android.view.MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @java.lang.Deprecated
    public static float getY(android.view.MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    @java.lang.Deprecated
    public static int getPointerCount(android.view.MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @java.lang.Deprecated
    public static int getSource(android.view.MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    public static boolean isFromSource(android.view.MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    @java.lang.Deprecated
    public static float getAxisValue(android.view.MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    @java.lang.Deprecated
    public static float getAxisValue(android.view.MotionEvent motionEvent, int i, int i2) {
        return motionEvent.getAxisValue(i, i2);
    }

    @java.lang.Deprecated
    public static int getButtonState(android.view.MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    private MotionEventCompat() {
    }
}
