package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrames {
    private static final java.lang.String CUSTOM_ATTRIBUTE = "CustomAttribute";
    private static final java.lang.String CUSTOM_METHOD = "CustomMethod";
    private static final java.lang.String TAG = "KeyFrames";
    public static final int UNSET = -1;
    static java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> sKeyMakers;
    private java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> mFramesMap = new java.util.HashMap<>();

    static {
        java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> map = new java.util.HashMap<>();
        sKeyMakers = map;
        try {
            map.put("KeyAttribute", androidx.constraintlayout.motion.widget.KeyAttributes.class.getConstructor(new java.lang.Class[0]));
            sKeyMakers.put(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.NAME, androidx.constraintlayout.motion.widget.KeyPosition.class.getConstructor(new java.lang.Class[0]));
            sKeyMakers.put(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.NAME, androidx.constraintlayout.motion.widget.KeyCycle.class.getConstructor(new java.lang.Class[0]));
            sKeyMakers.put("KeyTimeCycle", androidx.constraintlayout.motion.widget.KeyTimeCycle.class.getConstructor(new java.lang.Class[0]));
            sKeyMakers.put(androidx.constraintlayout.core.motion.utils.TypedValues.TriggerType.NAME, androidx.constraintlayout.motion.widget.KeyTrigger.class.getConstructor(new java.lang.Class[0]));
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.e(TAG, "unable to load", e);
        }
    }

    public void addKey(androidx.constraintlayout.motion.widget.Key key) {
        if (!this.mFramesMap.containsKey(java.lang.Integer.valueOf(key.mTargetId))) {
            this.mFramesMap.put(java.lang.Integer.valueOf(key.mTargetId), new java.util.ArrayList<>());
        }
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList = this.mFramesMap.get(java.lang.Integer.valueOf(key.mTargetId));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public KeyFrames() {
    }

    public KeyFrames(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        java.lang.Exception e;
        androidx.constraintlayout.motion.widget.Key keyNewInstance;
        try {
            int eventType = parser.getEventType();
            androidx.constraintlayout.motion.widget.Key key = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    java.lang.String name = parser.getName();
                    if (sKeyMakers.containsKey(name)) {
                        try {
                            java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key> constructor = sKeyMakers.get(name);
                            if (constructor != null) {
                                keyNewInstance = constructor.newInstance(new java.lang.Object[0]);
                                try {
                                    keyNewInstance.load(context, android.util.Xml.asAttributeSet(parser));
                                    addKey(keyNewInstance);
                                } catch (java.lang.Exception e2) {
                                    e = e2;
                                    android.util.Log.e(TAG, "unable to create ", e);
                                }
                                key = keyNewInstance;
                            } else {
                                throw new java.lang.NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (java.lang.Exception e3) {
                            androidx.constraintlayout.motion.widget.Key key2 = key;
                            e = e3;
                            keyNewInstance = key2;
                        }
                        android.util.Log.e(TAG, "unable to create ", e);
                        key = keyNewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (key != null && key.mCustomConstraints != null) {
                            androidx.constraintlayout.widget.ConstraintAttribute.parse(context, parser, key.mCustomConstraints);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && key != null && key.mCustomConstraints != null) {
                        androidx.constraintlayout.widget.ConstraintAttribute.parse(context, parser, key.mCustomConstraints);
                    }
                } else if (eventType == 3 && androidx.constraintlayout.motion.widget.ViewTransition.KEY_FRAME_SET_TAG.equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (java.io.IOException e4) {
            e4.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    public void addAllFrames(androidx.constraintlayout.motion.widget.MotionController motionController) {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList = this.mFramesMap.get(-1);
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
    }

    public void addFrames(androidx.constraintlayout.motion.widget.MotionController motionController) {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList = this.mFramesMap.get(java.lang.Integer.valueOf(motionController.mId));
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
        java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> arrayList2 = this.mFramesMap.get(-1);
        if (arrayList2 != null) {
            for (androidx.constraintlayout.motion.widget.Key key : arrayList2) {
                if (key.matches(((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag)) {
                    motionController.addKey(key);
                }
            }
        }
    }

    static java.lang.String name(int viewId, android.content.Context context) {
        return context.getResources().getResourceEntryName(viewId);
    }

    public java.util.Set<java.lang.Integer> getKeys() {
        return this.mFramesMap.keySet();
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> getKeyFramesForView(int id) {
        return this.mFramesMap.get(java.lang.Integer.valueOf(id));
    }
}
