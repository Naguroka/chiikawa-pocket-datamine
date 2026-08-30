package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends android.view.View {
    protected int mCount;
    protected androidx.constraintlayout.core.widgets.Helper mHelperWidget;
    protected int[] mIds;
    protected java.util.HashMap<java.lang.Integer, java.lang.String> mMap;
    protected java.lang.String mReferenceIds;
    protected java.lang.String mReferenceTags;
    protected boolean mUseViewMeasure;
    private android.view.View[] mViews;
    protected android.content.Context myContext;

    protected void applyLayoutFeaturesInConstraintSet(androidx.constraintlayout.widget.ConstraintLayout container) {
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    public void resolveRtl(androidx.constraintlayout.core.widgets.ConstraintWidget widget, boolean isRtl) {
    }

    public void updatePostConstraints(androidx.constraintlayout.widget.ConstraintLayout container) {
    }

    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout container) {
    }

    public void updatePostMeasure(androidx.constraintlayout.widget.ConstraintLayout container) {
    }

    public void updatePreDraw(androidx.constraintlayout.widget.ConstraintLayout container) {
    }

    public ConstraintHelper(android.content.Context context) {
        super(context);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new java.util.HashMap<>();
        this.myContext = context;
        init(null);
    }

    public ConstraintHelper(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new java.util.HashMap<>();
        this.myContext = context;
        init(attrs);
    }

    public ConstraintHelper(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.mViews = null;
        this.mMap = new java.util.HashMap<>();
        this.myContext = context;
        init(attrs);
    }

    protected void init(android.util.AttributeSet attrs) {
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    java.lang.String string = typedArrayObtainStyledAttributes.getString(index);
                    this.mReferenceIds = string;
                    setIds(string);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    java.lang.String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.mReferenceTags = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
        java.lang.String str2 = this.mReferenceTags;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void addView(android.view.View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            android.util.Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                android.util.Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.mReferenceIds = null;
            addRscID(view.getId());
            requestLayout();
        }
    }

    public int removeView(android.view.View view) {
        int i;
        int id = view.getId();
        int i2 = -1;
        if (id == -1) {
            return -1;
        }
        this.mReferenceIds = null;
        for (int i3 = 0; i3 < this.mCount; i3++) {
            if (this.mIds[i3] == id) {
                int i4 = i3;
                while (true) {
                    i = this.mCount;
                    if (i4 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.mIds;
                    int i5 = i4 + 1;
                    iArr[i4] = iArr[i5];
                    i4 = i5;
                }
                this.mIds[i - 1] = 0;
                this.mCount = i - 1;
                i2 = i3;
                break;
            }
        }
        requestLayout();
        return i2;
    }

    public int[] getReferencedIds() {
        return java.util.Arrays.copyOf(this.mIds, this.mCount);
    }

    public void setReferencedIds(int[] ids) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int i : ids) {
            addRscID(i);
        }
    }

    private void addRscID(int id) {
        if (id == getId()) {
            return;
        }
        int i = this.mCount + 1;
        int[] iArr = this.mIds;
        if (i > iArr.length) {
            this.mIds = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i2 = this.mCount;
        iArr2[i2] = id;
        this.mCount = i2 + 1;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.mUseViewMeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void validateParams() {
        if (this.mHelperWidget == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
            ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).widget = (androidx.constraintlayout.core.widgets.ConstraintWidget) this.mHelperWidget;
        }
    }

    private void addID(java.lang.String idString) {
        if (idString == null || idString.length() == 0 || this.myContext == null) {
            return;
        }
        java.lang.String strTrim = idString.trim();
        if (getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout) {
        }
        int iFindId = findId(strTrim);
        if (iFindId != 0) {
            this.mMap.put(java.lang.Integer.valueOf(iFindId), strTrim);
            addRscID(iFindId);
        } else {
            android.util.Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    private void addTag(java.lang.String tagString) {
        if (tagString == null || tagString.length() == 0 || this.myContext == null) {
            return;
        }
        java.lang.String strTrim = tagString.trim();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            android.util.Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) && strTrim.equals(((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).constraintTag)) {
                if (childAt.getId() == -1) {
                    android.util.Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    addRscID(childAt.getId());
                }
            }
        }
    }

    private int findId(java.lang.String referenceId) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) getParent() : null;
        int iFindId = 0;
        if (isInEditMode() && constraintLayout != null) {
            java.lang.Object designInformation = constraintLayout.getDesignInformation(0, referenceId);
            if (designInformation instanceof java.lang.Integer) {
                iFindId = ((java.lang.Integer) designInformation).intValue();
            }
        }
        if (iFindId == 0 && constraintLayout != null) {
            iFindId = findId(constraintLayout, referenceId);
        }
        if (iFindId == 0) {
            try {
                iFindId = androidx.constraintlayout.widget.R.id.class.getField(referenceId).getInt(null);
            } catch (java.lang.Exception unused) {
            }
        }
        return iFindId == 0 ? this.myContext.getResources().getIdentifier(referenceId, "id", this.myContext.getPackageName()) : iFindId;
    }

    private int findId(androidx.constraintlayout.widget.ConstraintLayout container, java.lang.String idString) {
        android.content.res.Resources resources;
        java.lang.String resourceEntryName;
        if (idString == null || container == null || (resources = this.myContext.getResources()) == null) {
            return 0;
        }
        int childCount = container.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = container.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (android.content.res.Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (idString.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    protected void setIds(java.lang.String idList) {
        this.mReferenceIds = idList;
        if (idList == null) {
            return;
        }
        int i = 0;
        this.mCount = 0;
        while (true) {
            int iIndexOf = idList.indexOf(44, i);
            if (iIndexOf == -1) {
                addID(idList.substring(i));
                return;
            } else {
                addID(idList.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(java.lang.String tagList) {
        this.mReferenceTags = tagList;
        if (tagList == null) {
            return;
        }
        int i = 0;
        this.mCount = 0;
        while (true) {
            int iIndexOf = tagList.indexOf(44, i);
            if (iIndexOf == -1) {
                addTag(tagList.substring(i));
                return;
            } else {
                addTag(tagList.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected void applyLayoutFeatures(androidx.constraintlayout.widget.ConstraintLayout container) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.mCount; i++) {
            android.view.View viewById = container.getViewById(this.mIds[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void applyLayoutFeatures() {
        android.view.ViewParent parent = getParent();
        if (parent == null || !(parent instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((androidx.constraintlayout.widget.ConstraintLayout) parent);
    }

    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout container) {
        java.lang.String str;
        int iFindId;
        if (isInEditMode()) {
            setIds(this.mReferenceIds);
        }
        androidx.constraintlayout.core.widgets.Helper helper = this.mHelperWidget;
        if (helper == null) {
            return;
        }
        helper.removeAllIds();
        for (int i = 0; i < this.mCount; i++) {
            int i2 = this.mIds[i];
            android.view.View viewById = container.getViewById(i2);
            if (viewById == null && (iFindId = findId(container, (str = this.mMap.get(java.lang.Integer.valueOf(i2))))) != 0) {
                this.mIds[i] = iFindId;
                this.mMap.put(java.lang.Integer.valueOf(iFindId), str);
                viewById = container.getViewById(iFindId);
            }
            if (viewById != null) {
                this.mHelperWidget.add(container.getViewWidget(viewById));
            }
        }
        this.mHelperWidget.updateConstraints(container.mLayoutWidget);
    }

    public void updatePreLayout(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer container, androidx.constraintlayout.core.widgets.Helper helper, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> map) {
        helper.removeAllIds();
        for (int i = 0; i < this.mCount; i++) {
            helper.add(map.get(this.mIds[i]));
        }
    }

    protected android.view.View[] getViews(androidx.constraintlayout.widget.ConstraintLayout layout) {
        android.view.View[] viewArr = this.mViews;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.mViews = new android.view.View[this.mCount];
        }
        for (int i = 0; i < this.mCount; i++) {
            this.mViews[i] = layout.getViewById(this.mIds[i]);
        }
        return this.mViews;
    }

    public void loadParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, androidx.constraintlayout.core.widgets.HelperWidget child, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> mapIdToWidget) {
        if (constraint.layout.mReferenceIds != null) {
            setReferencedIds(constraint.layout.mReferenceIds);
        } else if (constraint.layout.mReferenceIdString != null) {
            if (constraint.layout.mReferenceIdString.length() > 0) {
                constraint.layout.mReferenceIds = convertReferenceString(this, constraint.layout.mReferenceIdString);
            } else {
                constraint.layout.mReferenceIds = null;
            }
        }
        if (child != null) {
            child.removeAllIds();
            if (constraint.layout.mReferenceIds != null) {
                for (int i = 0; i < constraint.layout.mReferenceIds.length; i++) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = mapIdToWidget.get(constraint.layout.mReferenceIds[i]);
                    if (constraintWidget != null) {
                        child.add(constraintWidget);
                    }
                }
            }
        }
    }

    private int[] convertReferenceString(android.view.View view, java.lang.String referenceIdString) {
        java.lang.String[] strArrSplit = referenceIdString.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        for (java.lang.String str : strArrSplit) {
            int iFindId = findId(str.trim());
            if (iFindId != 0) {
                iArr[i] = iFindId;
                i++;
            }
        }
        return i != strArrSplit.length ? java.util.Arrays.copyOf(iArr, i) : iArr;
    }

    @Override // android.view.View
    public void setTag(int key, java.lang.Object tag) {
        super.setTag(key, tag);
        if (tag == null && this.mReferenceIds == null) {
            addRscID(key);
        }
    }

    public boolean containsId(final int id) {
        for (int i : this.mIds) {
            if (i == id) {
                return true;
            }
        }
        return false;
    }

    public int indexFromId(final int id) {
        int i = -1;
        for (int i2 : this.mIds) {
            i++;
            if (i2 == id) {
                return i;
            }
        }
        return i;
    }
}
