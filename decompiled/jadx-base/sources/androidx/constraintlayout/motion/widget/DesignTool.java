package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class DesignTool implements androidx.constraintlayout.motion.widget.ProxyInterface {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "DesignTool";
    static final java.util.HashMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.String> allAttributes;
    static final java.util.HashMap<java.lang.String, java.lang.String> allMargins;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private androidx.constraintlayout.motion.widget.MotionScene mSceneCache;
    private java.lang.String mLastStartState = null;
    private java.lang.String mLastEndState = null;
    private int mLastStartStateId = -1;
    private int mLastEndStateId = -1;

    public DesignTool(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    static {
        java.util.HashMap<android.util.Pair<java.lang.Integer, java.lang.Integer>, java.lang.String> map = new java.util.HashMap<>();
        allAttributes = map;
        java.util.HashMap<java.lang.String, java.lang.String> map2 = new java.util.HashMap<>();
        allMargins = map2;
        map.put(android.util.Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(android.util.Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(android.util.Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(android.util.Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(android.util.Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(android.util.Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(android.util.Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(android.util.Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(android.util.Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(android.util.Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(android.util.Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(android.util.Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(android.util.Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    private static int GetPxFromDp(int dpi, java.lang.String value) {
        int iIndexOf;
        if (value == null || (iIndexOf = value.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((java.lang.Integer.valueOf(value.substring(0, iIndexOf)).intValue() * dpi) / 160.0f);
    }

    private static void Connect(int dpi, androidx.constraintlayout.widget.ConstraintSet set, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> attributes, int from, int to) {
        java.lang.String str = allAttributes.get(android.util.Pair.create(java.lang.Integer.valueOf(from), java.lang.Integer.valueOf(to)));
        java.lang.String str2 = attributes.get(str);
        if (str2 != null) {
            java.lang.String str3 = allMargins.get(str);
            int iGetPxFromDp = str3 != null ? GetPxFromDp(dpi, attributes.get(str3)) : 0;
            set.connect(view.getId(), from, java.lang.Integer.parseInt(str2), to, iGetPxFromDp);
        }
    }

    private static void SetBias(androidx.constraintlayout.widget.ConstraintSet set, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> attributes, int type) {
        java.lang.String str = attributes.get(type == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (type == 0) {
                set.setHorizontalBias(view.getId(), java.lang.Float.parseFloat(str));
            } else if (type == 1) {
                set.setVerticalBias(view.getId(), java.lang.Float.parseFloat(str));
            }
        }
    }

    private static void SetDimensions(int dpi, androidx.constraintlayout.widget.ConstraintSet set, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> attributes, int type) {
        java.lang.String str = attributes.get(type == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iGetPxFromDp = !str.equalsIgnoreCase("wrap_content") ? GetPxFromDp(dpi, str) : -2;
            if (type == 0) {
                set.constrainWidth(view.getId(), iGetPxFromDp);
            } else {
                set.constrainHeight(view.getId(), iGetPxFromDp);
            }
        }
    }

    private static void SetAbsolutePositions(int dpi, androidx.constraintlayout.widget.ConstraintSet set, android.view.View view, java.util.HashMap<java.lang.String, java.lang.String> attributes) {
        java.lang.String str = attributes.get("layout_editor_absoluteX");
        if (str != null) {
            set.setEditorAbsoluteX(view.getId(), GetPxFromDp(dpi, str));
        }
        java.lang.String str2 = attributes.get("layout_editor_absoluteY");
        if (str2 != null) {
            set.setEditorAbsoluteY(view.getId(), GetPxFromDp(dpi, str2));
        }
    }

    public int getAnimationPath(java.lang.Object view, float[] path, int len) {
        if (this.mMotionLayout.mScene == null) {
            return -1;
        }
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get(view);
        if (motionController == null) {
            return 0;
        }
        motionController.buildPath(path, len);
        return len;
    }

    public void getAnimationRectangles(java.lang.Object view, float[] path) {
        if (this.mMotionLayout.mScene == null) {
            return;
        }
        int duration = this.mMotionLayout.mScene.getDuration() / 16;
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get(view);
        if (motionController == null) {
            return;
        }
        motionController.buildRectangles(path, duration);
    }

    public int getAnimationKeyFrames(java.lang.Object view, float[] key) {
        if (this.mMotionLayout.mScene == null) {
            return -1;
        }
        int duration = this.mMotionLayout.mScene.getDuration() / 16;
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get(view);
        if (motionController == null) {
            return 0;
        }
        motionController.buildKeyFrames(key, null);
        return duration;
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setToolPosition(float position) {
        if (this.mMotionLayout.mScene == null) {
            this.mMotionLayout.mScene = this.mSceneCache;
        }
        this.mMotionLayout.setProgress(position);
        this.mMotionLayout.evaluate(true);
        this.mMotionLayout.requestLayout();
        this.mMotionLayout.invalidate();
    }

    public void setState(java.lang.String id) {
        if (id == null) {
            id = "motion_base";
        }
        if (this.mLastStartState == id) {
            return;
        }
        this.mLastStartState = id;
        this.mLastEndState = null;
        if (this.mMotionLayout.mScene == null) {
            this.mMotionLayout.mScene = this.mSceneCache;
        }
        int iLookUpConstraintId = this.mMotionLayout.lookUpConstraintId(id);
        this.mLastStartStateId = iLookUpConstraintId;
        if (iLookUpConstraintId != 0) {
            if (iLookUpConstraintId == this.mMotionLayout.getStartState()) {
                this.mMotionLayout.setProgress(0.0f);
            } else if (iLookUpConstraintId == this.mMotionLayout.getEndState()) {
                this.mMotionLayout.setProgress(1.0f);
            } else {
                this.mMotionLayout.transitionToState(iLookUpConstraintId);
                this.mMotionLayout.setProgress(1.0f);
            }
        }
        this.mMotionLayout.requestLayout();
    }

    public java.lang.String getStartState() {
        int startState = this.mMotionLayout.getStartState();
        if (this.mLastStartStateId == startState) {
            return this.mLastStartState;
        }
        java.lang.String constraintSetNames = this.mMotionLayout.getConstraintSetNames(startState);
        if (constraintSetNames != null) {
            this.mLastStartState = constraintSetNames;
            this.mLastStartStateId = startState;
        }
        return this.mMotionLayout.getConstraintSetNames(startState);
    }

    public java.lang.String getEndState() {
        int endState = this.mMotionLayout.getEndState();
        if (this.mLastEndStateId == endState) {
            return this.mLastEndState;
        }
        java.lang.String constraintSetNames = this.mMotionLayout.getConstraintSetNames(endState);
        if (constraintSetNames != null) {
            this.mLastEndState = constraintSetNames;
            this.mLastEndStateId = endState;
        }
        return constraintSetNames;
    }

    public float getProgress() {
        return this.mMotionLayout.getProgress();
    }

    public java.lang.String getState() {
        if (this.mLastStartState != null && this.mLastEndState != null) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.mLastStartState;
            }
            if (progress >= 0.99f) {
                return this.mLastEndState;
            }
        }
        return this.mLastStartState;
    }

    public boolean isInTransition() {
        return (this.mLastStartState == null || this.mLastEndState == null) ? false : true;
    }

    public void setTransition(java.lang.String start, java.lang.String end) {
        if (this.mMotionLayout.mScene == null) {
            this.mMotionLayout.mScene = this.mSceneCache;
        }
        int iLookUpConstraintId = this.mMotionLayout.lookUpConstraintId(start);
        int iLookUpConstraintId2 = this.mMotionLayout.lookUpConstraintId(end);
        this.mMotionLayout.setTransition(iLookUpConstraintId, iLookUpConstraintId2);
        this.mLastStartStateId = iLookUpConstraintId;
        this.mLastEndStateId = iLookUpConstraintId2;
        this.mLastStartState = start;
        this.mLastEndState = end;
    }

    public void disableAutoTransition(boolean disable) {
        this.mMotionLayout.disableAutoTransition(disable);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public long getTransitionTimeMs() {
        return this.mMotionLayout.getTransitionTimeMs();
    }

    public int getKeyFramePositions(java.lang.Object view, int[] type, float[] pos) {
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get((android.view.View) view);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFramePositions(type, pos);
    }

    public int getKeyFrameInfo(java.lang.Object view, int type, int[] info) {
        androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get((android.view.View) view);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFrameInfo(type, info);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public float getKeyFramePosition(java.lang.Object view, int type, float x, float y) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        if ((view instanceof android.view.View) && (motionController = this.mMotionLayout.mFrameArrayList.get((android.view.View) view)) != null) {
            return motionController.getKeyFrameParameter(type, x, y);
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setKeyFrame(java.lang.Object view, int position, java.lang.String name, java.lang.Object value) {
        if (this.mMotionLayout.mScene != null) {
            this.mMotionLayout.mScene.setKeyframe((android.view.View) view, position, name, value);
            this.mMotionLayout.mTransitionGoalPosition = position / 100.0f;
            this.mMotionLayout.mTransitionLastPosition = 0.0f;
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.evaluate(true);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public boolean setKeyFramePosition(java.lang.Object view, int position, int type, float x, float y) {
        if ((view instanceof android.view.View) && this.mMotionLayout.mScene != null) {
            androidx.constraintlayout.motion.widget.MotionController motionController = this.mMotionLayout.mFrameArrayList.get(view);
            int i = (int) (this.mMotionLayout.mTransitionPosition * 100.0f);
            if (motionController != null) {
                android.view.View view2 = (android.view.View) view;
                if (this.mMotionLayout.mScene.hasKeyFramePosition(view2, i)) {
                    float keyFrameParameter = motionController.getKeyFrameParameter(2, x, y);
                    float keyFrameParameter2 = motionController.getKeyFrameParameter(5, x, y);
                    this.mMotionLayout.mScene.setKeyframe(view2, i, "motion:percentX", java.lang.Float.valueOf(keyFrameParameter));
                    this.mMotionLayout.mScene.setKeyframe(view2, i, "motion:percentY", java.lang.Float.valueOf(keyFrameParameter2));
                    this.mMotionLayout.rebuildScene();
                    this.mMotionLayout.evaluate(true);
                    this.mMotionLayout.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setViewDebug(java.lang.Object view, int debugMode) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        if ((view instanceof android.view.View) && (motionController = this.mMotionLayout.mFrameArrayList.get(view)) != null) {
            motionController.setDrawPath(debugMode);
            this.mMotionLayout.invalidate();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public int designAccess(int cmd, java.lang.String type, java.lang.Object viewObject, float[] in, int inLength, float[] out, int outLength) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        android.view.View view = (android.view.View) viewObject;
        if (cmd == 0) {
            motionController = null;
        } else if (this.mMotionLayout.mScene == null || view == null || (motionController = this.mMotionLayout.mFrameArrayList.get(view)) == null) {
            return -1;
        }
        if (cmd == 0) {
            return 1;
        }
        if (cmd == 1) {
            int duration = this.mMotionLayout.mScene.getDuration() / 16;
            motionController.buildPath(out, duration);
            return duration;
        }
        if (cmd == 2) {
            int duration2 = this.mMotionLayout.mScene.getDuration() / 16;
            motionController.buildKeyFrames(out, null);
            return duration2;
        }
        if (cmd != 3) {
            return -1;
        }
        int duration3 = this.mMotionLayout.mScene.getDuration() / 16;
        return motionController.getAttributeValues(type, out, outLength);
    }

    public java.lang.Object getKeyframe(int type, int target, int position) {
        if (this.mMotionLayout.mScene == null) {
            return null;
        }
        return this.mMotionLayout.mScene.getKeyFrame(this.mMotionLayout.getContext(), type, target, position);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public java.lang.Object getKeyframeAtLocation(java.lang.Object viewObject, float x, float y) {
        androidx.constraintlayout.motion.widget.MotionController motionController;
        android.view.View view = (android.view.View) viewObject;
        if (this.mMotionLayout.mScene == null) {
            return -1;
        }
        if (view == null || (motionController = this.mMotionLayout.mFrameArrayList.get(view)) == null) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        return motionController.getPositionKeyframe(viewGroup.getWidth(), viewGroup.getHeight(), x, y);
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public java.lang.Boolean getPositionKeyframe(java.lang.Object keyFrame, java.lang.Object view, float x, float y, java.lang.String[] attribute, float[] value) {
        if (keyFrame instanceof androidx.constraintlayout.motion.widget.KeyPositionBase) {
            android.view.View view2 = (android.view.View) view;
            this.mMotionLayout.mFrameArrayList.get(view2).positionKeyframe(view2, (androidx.constraintlayout.motion.widget.KeyPositionBase) keyFrame, x, y, attribute, value);
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.mInTransition = true;
            return true;
        }
        return false;
    }

    public java.lang.Object getKeyframe(java.lang.Object view, int type, int position) {
        if (this.mMotionLayout.mScene == null) {
            return null;
        }
        return this.mMotionLayout.mScene.getKeyFrame(this.mMotionLayout.getContext(), type, ((android.view.View) view).getId(), position);
    }

    public void setKeyframe(java.lang.Object keyFrame, java.lang.String tag, java.lang.Object value) {
        if (keyFrame instanceof androidx.constraintlayout.motion.widget.Key) {
            ((androidx.constraintlayout.motion.widget.Key) keyFrame).setValue(tag, value);
            this.mMotionLayout.rebuildScene();
            this.mMotionLayout.mInTransition = true;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.ProxyInterface
    public void setAttributes(int dpi, java.lang.String constraintSetId, java.lang.Object opaqueView, java.lang.Object opaqueAttributes) {
        android.view.View view = (android.view.View) opaqueView;
        java.util.HashMap map = (java.util.HashMap) opaqueAttributes;
        int iLookUpConstraintId = this.mMotionLayout.lookUpConstraintId(constraintSetId);
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.mMotionLayout.mScene.getConstraintSet(iLookUpConstraintId);
        if (constraintSet == null) {
            return;
        }
        constraintSet.clear(view.getId());
        SetDimensions(dpi, constraintSet, view, map, 0);
        SetDimensions(dpi, constraintSet, view, map, 1);
        Connect(dpi, constraintSet, view, map, 6, 6);
        Connect(dpi, constraintSet, view, map, 6, 7);
        Connect(dpi, constraintSet, view, map, 7, 7);
        Connect(dpi, constraintSet, view, map, 7, 6);
        Connect(dpi, constraintSet, view, map, 1, 1);
        Connect(dpi, constraintSet, view, map, 1, 2);
        Connect(dpi, constraintSet, view, map, 2, 2);
        Connect(dpi, constraintSet, view, map, 2, 1);
        Connect(dpi, constraintSet, view, map, 3, 3);
        Connect(dpi, constraintSet, view, map, 3, 4);
        Connect(dpi, constraintSet, view, map, 4, 3);
        Connect(dpi, constraintSet, view, map, 4, 4);
        Connect(dpi, constraintSet, view, map, 5, 5);
        SetBias(constraintSet, view, map, 0);
        SetBias(constraintSet, view, map, 1);
        SetAbsolutePositions(dpi, constraintSet, view, map);
        this.mMotionLayout.updateState(iLookUpConstraintId, constraintSet);
        this.mMotionLayout.requestLayout();
    }

    public void dumpConstraintSet(java.lang.String set) {
        if (this.mMotionLayout.mScene == null) {
            this.mMotionLayout.mScene = this.mSceneCache;
        }
        int iLookUpConstraintId = this.mMotionLayout.lookUpConstraintId(set);
        java.lang.System.out.println(" dumping  " + set + " (" + iLookUpConstraintId + ")");
        try {
            this.mMotionLayout.mScene.getConstraintSet(iLookUpConstraintId).dump(this.mMotionLayout.mScene, new int[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
