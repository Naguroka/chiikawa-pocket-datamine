package androidx.constraintlayout.motion.widget;

/* JADX INFO: compiled from: DesignTool.java */
/* JADX INFO: loaded from: classes.dex */
interface ProxyInterface {
    int designAccess(int cmd, java.lang.String type, java.lang.Object viewObject, float[] in, int inLength, float[] out, int outLength);

    float getKeyFramePosition(java.lang.Object view, int type, float x, float y);

    java.lang.Object getKeyframeAtLocation(java.lang.Object viewObject, float x, float y);

    java.lang.Boolean getPositionKeyframe(java.lang.Object keyFrame, java.lang.Object view, float x, float y, java.lang.String[] attribute, float[] value);

    long getTransitionTimeMs();

    void setAttributes(int dpi, java.lang.String constraintSetId, java.lang.Object opaqueView, java.lang.Object opaqueAttributes);

    void setKeyFrame(java.lang.Object view, int position, java.lang.String name, java.lang.Object value);

    boolean setKeyFramePosition(java.lang.Object view, int position, int type, float x, float y);

    void setToolPosition(float position);
}
