package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStates {
    private static final boolean DEBUG = false;
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    private final androidx.constraintlayout.widget.ConstraintLayout mConstraintLayout;
    androidx.constraintlayout.widget.ConstraintSet mDefaultConstraintSet;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates.State> mStateList = new android.util.SparseArray<>();
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap = new android.util.SparseArray<>();
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener = null;

    ConstraintLayoutStates(android.content.Context context, androidx.constraintlayout.widget.ConstraintLayout layout, int resourceID) {
        this.mConstraintLayout = layout;
        load(context, resourceID);
    }

    public boolean needsToChange(int id, float width, float height) {
        int i = this.mCurrentStateId;
        if (i != id) {
            return true;
        }
        androidx.constraintlayout.widget.ConstraintLayoutStates.State stateValueAt = id == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i);
        return (this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(this.mCurrentConstraintNumber).match(width, height)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(width, height);
    }

    public void updateConstraints(int id, float width, float height) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet;
        int i;
        androidx.constraintlayout.widget.ConstraintLayoutStates.State stateValueAt;
        int iFindMatch;
        androidx.constraintlayout.widget.ConstraintSet constraintSet2;
        int i2;
        int i3 = this.mCurrentStateId;
        if (i3 == id) {
            if (id == -1) {
                stateValueAt = this.mStateList.valueAt(0);
            } else {
                stateValueAt = this.mStateList.get(i3);
            }
            if ((this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(this.mCurrentConstraintNumber).match(width, height)) && this.mCurrentConstraintNumber != (iFindMatch = stateValueAt.findMatch(width, height))) {
                if (iFindMatch == -1) {
                    constraintSet2 = this.mDefaultConstraintSet;
                } else {
                    constraintSet2 = stateValueAt.mVariants.get(iFindMatch).mConstraintSet;
                }
                if (iFindMatch == -1) {
                    i2 = stateValueAt.mConstraintID;
                } else {
                    i2 = stateValueAt.mVariants.get(iFindMatch).mConstraintID;
                }
                if (constraintSet2 == null) {
                    return;
                }
                this.mCurrentConstraintNumber = iFindMatch;
                androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener = this.mConstraintsChangedListener;
                if (constraintsChangedListener != null) {
                    constraintsChangedListener.preLayoutChange(-1, i2);
                }
                constraintSet2.applyTo(this.mConstraintLayout);
                androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener2 = this.mConstraintsChangedListener;
                if (constraintsChangedListener2 != null) {
                    constraintsChangedListener2.postLayoutChange(-1, i2);
                    return;
                }
                return;
            }
            return;
        }
        this.mCurrentStateId = id;
        androidx.constraintlayout.widget.ConstraintLayoutStates.State state = this.mStateList.get(id);
        int iFindMatch2 = state.findMatch(width, height);
        if (iFindMatch2 == -1) {
            constraintSet = state.mConstraintSet;
        } else {
            constraintSet = state.mVariants.get(iFindMatch2).mConstraintSet;
        }
        if (iFindMatch2 == -1) {
            i = state.mConstraintID;
        } else {
            i = state.mVariants.get(iFindMatch2).mConstraintID;
        }
        if (constraintSet == null) {
            android.util.Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + id + ", dim =" + width + ", " + height);
            return;
        }
        this.mCurrentConstraintNumber = iFindMatch2;
        androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener3 = this.mConstraintsChangedListener;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(id, i);
        }
        constraintSet.applyTo(this.mConstraintLayout);
        androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener4 = this.mConstraintsChangedListener;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(id, i);
        }
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    static class State {
        int mConstraintID;
        androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
        int mId;
        java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates.Variant> mVariants = new java.util.ArrayList<>();

        public State(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
            this.mConstraintID = -1;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(parser), androidx.constraintlayout.widget.R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.State_android_id) {
                    this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == androidx.constraintlayout.widget.R.styleable.State_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void add(androidx.constraintlayout.widget.ConstraintLayoutStates.Variant size) {
            this.mVariants.add(size);
        }

        public int findMatch(float width, float height) {
            for (int i = 0; i < this.mVariants.size(); i++) {
                if (this.mVariants.get(i).match(width, height)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int mConstraintID;
        androidx.constraintlayout.widget.ConstraintSet mConstraintSet;
        int mId;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(parser), androidx.constraintlayout.widget.R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Variant_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if (androidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.clone(context, this.mConstraintID);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMinWidth);
                } else {
                    android.util.Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean match(float widthDp, float heightDp) {
            if (!java.lang.Float.isNaN(this.mMinWidth) && widthDp < this.mMinWidth) {
                return false;
            }
            if (!java.lang.Float.isNaN(this.mMinHeight) && heightDp < this.mMinHeight) {
                return false;
            }
            if (java.lang.Float.isNaN(this.mMaxWidth) || widthDp <= this.mMaxWidth) {
                return java.lang.Float.isNaN(this.mMaxHeight) || heightDp <= this.mMaxHeight;
            }
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void load(android.content.Context context, int resourceId) {
        android.content.res.XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            int eventType = xml.getEventType();
            androidx.constraintlayout.widget.ConstraintLayoutStates.State state = null;
            while (true) {
                byte b = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 2) {
                        state = new androidx.constraintlayout.widget.ConstraintLayoutStates.State(context, xml);
                        this.mStateList.put(state.mId, state);
                    } else if (b == 3) {
                        androidx.constraintlayout.widget.ConstraintLayoutStates.Variant variant = new androidx.constraintlayout.widget.ConstraintLayoutStates.Variant(context, xml);
                        if (state != null) {
                            state.add(variant);
                        }
                    } else if (b == 4) {
                        parseConstraintSet(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void parseConstraintSet(android.content.Context context, org.xmlpull.v1.XmlPullParser parser) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        int attributeCount = parser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = parser.getAttributeName(i);
            java.lang.String attributeValue = parser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = java.lang.Integer.parseInt(attributeValue.substring(1));
                    } else {
                        android.util.Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.load(context, parser);
                this.mConstraintSetMap.put(identifier, constraintSet);
                return;
            }
        }
    }
}
