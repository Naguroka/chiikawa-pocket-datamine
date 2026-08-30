package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public class State {
    static final int CONSTRAINT_RATIO = 2;
    static final int CONSTRAINT_SPREAD = 0;
    static final int CONSTRAINT_WRAP = 1;
    public static final java.lang.Integer PARENT = 0;
    static final int UNKNOWN = -1;
    public final androidx.constraintlayout.core.state.ConstraintReference mParent;
    private int numHelpers;
    protected java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> mReferences = new java.util.HashMap<>();
    protected java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.HelperReference> mHelperReferences = new java.util.HashMap<>();
    java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> mTags = new java.util.HashMap<>();

    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public State() {
        androidx.constraintlayout.core.state.ConstraintReference constraintReference = new androidx.constraintlayout.core.state.ConstraintReference(this);
        this.mParent = constraintReference;
        this.numHelpers = 0;
        this.mReferences.put(PARENT, constraintReference);
    }

    public void reset() {
        this.mHelperReferences.clear();
        this.mTags.clear();
    }

    public int convertDimension(java.lang.Object obj) {
        if (obj instanceof java.lang.Float) {
            return ((java.lang.Float) obj).intValue();
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        return 0;
    }

    public androidx.constraintlayout.core.state.ConstraintReference createConstraintReference(java.lang.Object obj) {
        return new androidx.constraintlayout.core.state.ConstraintReference(this);
    }

    public boolean sameFixedWidth(int i) {
        return this.mParent.getWidth().equalsFixedValue(i);
    }

    public boolean sameFixedHeight(int i) {
        return this.mParent.getHeight().equalsFixedValue(i);
    }

    public androidx.constraintlayout.core.state.State width(androidx.constraintlayout.core.state.Dimension dimension) {
        return setWidth(dimension);
    }

    public androidx.constraintlayout.core.state.State height(androidx.constraintlayout.core.state.Dimension dimension) {
        return setHeight(dimension);
    }

    public androidx.constraintlayout.core.state.State setWidth(androidx.constraintlayout.core.state.Dimension dimension) {
        this.mParent.setWidth(dimension);
        return this;
    }

    public androidx.constraintlayout.core.state.State setHeight(androidx.constraintlayout.core.state.Dimension dimension) {
        this.mParent.setHeight(dimension);
        return this;
    }

    androidx.constraintlayout.core.state.Reference reference(java.lang.Object obj) {
        return this.mReferences.get(obj);
    }

    public androidx.constraintlayout.core.state.ConstraintReference constraints(java.lang.Object obj) {
        androidx.constraintlayout.core.state.Reference referenceCreateConstraintReference = this.mReferences.get(obj);
        if (referenceCreateConstraintReference == null) {
            referenceCreateConstraintReference = createConstraintReference(obj);
            this.mReferences.put(obj, referenceCreateConstraintReference);
            referenceCreateConstraintReference.setKey(obj);
        }
        if (referenceCreateConstraintReference instanceof androidx.constraintlayout.core.state.ConstraintReference) {
            return (androidx.constraintlayout.core.state.ConstraintReference) referenceCreateConstraintReference;
        }
        return null;
    }

    private java.lang.String createHelperKey() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("__HELPER_KEY_");
        int i = this.numHelpers;
        this.numHelpers = i + 1;
        return sb.append(i).append("__").toString();
    }

    public androidx.constraintlayout.core.state.HelperReference helper(java.lang.Object obj, androidx.constraintlayout.core.state.State.Helper helper) {
        androidx.constraintlayout.core.state.HelperReference horizontalChainReference;
        if (obj == null) {
            obj = createHelperKey();
        }
        androidx.constraintlayout.core.state.HelperReference helperReference = this.mHelperReferences.get(obj);
        if (helperReference == null) {
            int i = androidx.constraintlayout.core.state.State.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Helper[helper.ordinal()];
            if (i == 1) {
                horizontalChainReference = new androidx.constraintlayout.core.state.helpers.HorizontalChainReference(this);
            } else if (i == 2) {
                horizontalChainReference = new androidx.constraintlayout.core.state.helpers.VerticalChainReference(this);
            } else if (i == 3) {
                horizontalChainReference = new androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference(this);
            } else if (i == 4) {
                horizontalChainReference = new androidx.constraintlayout.core.state.helpers.AlignVerticallyReference(this);
            } else {
                if (i == 5) {
                    horizontalChainReference = new androidx.constraintlayout.core.state.helpers.BarrierReference(this);
                } else {
                    helperReference = new androidx.constraintlayout.core.state.HelperReference(this, helper);
                }
                helperReference.setKey(obj);
                this.mHelperReferences.put(obj, helperReference);
            }
            helperReference = horizontalChainReference;
            helperReference.setKey(obj);
            this.mHelperReferences.put(obj, helperReference);
        }
        return helperReference;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.State$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Helper;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.state.State.Helper.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Helper = iArr;
            try {
                iArr[androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Helper[androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Helper[androidx.constraintlayout.core.state.State.Helper.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Helper[androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Helper[androidx.constraintlayout.core.state.State.Helper.BARRIER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference horizontalGuideline(java.lang.Object obj) {
        return guideline(obj, 0);
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference verticalGuideline(java.lang.Object obj) {
        return guideline(obj, 1);
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference guideline(java.lang.Object obj, int i) {
        androidx.constraintlayout.core.state.ConstraintReference constraintReferenceConstraints = constraints(obj);
        if (constraintReferenceConstraints.getFacade() == null || !(constraintReferenceConstraints.getFacade() instanceof androidx.constraintlayout.core.state.helpers.GuidelineReference)) {
            androidx.constraintlayout.core.state.helpers.GuidelineReference guidelineReference = new androidx.constraintlayout.core.state.helpers.GuidelineReference(this);
            guidelineReference.setOrientation(i);
            guidelineReference.setKey(obj);
            constraintReferenceConstraints.setFacade(guidelineReference);
        }
        return (androidx.constraintlayout.core.state.helpers.GuidelineReference) constraintReferenceConstraints.getFacade();
    }

    public androidx.constraintlayout.core.state.helpers.BarrierReference barrier(java.lang.Object obj, androidx.constraintlayout.core.state.State.Direction direction) {
        androidx.constraintlayout.core.state.ConstraintReference constraintReferenceConstraints = constraints(obj);
        if (constraintReferenceConstraints.getFacade() == null || !(constraintReferenceConstraints.getFacade() instanceof androidx.constraintlayout.core.state.helpers.BarrierReference)) {
            androidx.constraintlayout.core.state.helpers.BarrierReference barrierReference = new androidx.constraintlayout.core.state.helpers.BarrierReference(this);
            barrierReference.setBarrierDirection(direction);
            constraintReferenceConstraints.setFacade(barrierReference);
        }
        return (androidx.constraintlayout.core.state.helpers.BarrierReference) constraintReferenceConstraints.getFacade();
    }

    public androidx.constraintlayout.core.state.helpers.VerticalChainReference verticalChain() {
        return (androidx.constraintlayout.core.state.helpers.VerticalChainReference) helper(null, androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.VerticalChainReference verticalChain(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.VerticalChainReference verticalChainReference = (androidx.constraintlayout.core.state.helpers.VerticalChainReference) helper(null, androidx.constraintlayout.core.state.State.Helper.VERTICAL_CHAIN);
        verticalChainReference.add(objArr);
        return verticalChainReference;
    }

    public androidx.constraintlayout.core.state.helpers.HorizontalChainReference horizontalChain() {
        return (androidx.constraintlayout.core.state.helpers.HorizontalChainReference) helper(null, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.HorizontalChainReference horizontalChain(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.HorizontalChainReference horizontalChainReference = (androidx.constraintlayout.core.state.helpers.HorizontalChainReference) helper(null, androidx.constraintlayout.core.state.State.Helper.HORIZONTAL_CHAIN);
        horizontalChainReference.add(objArr);
        return horizontalChainReference;
    }

    public androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference centerHorizontally(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference alignHorizontallyReference = (androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference) helper(null, androidx.constraintlayout.core.state.State.Helper.ALIGN_HORIZONTALLY);
        alignHorizontallyReference.add(objArr);
        return alignHorizontallyReference;
    }

    public androidx.constraintlayout.core.state.helpers.AlignVerticallyReference centerVertically(java.lang.Object... objArr) {
        androidx.constraintlayout.core.state.helpers.AlignVerticallyReference alignVerticallyReference = (androidx.constraintlayout.core.state.helpers.AlignVerticallyReference) helper(null, androidx.constraintlayout.core.state.State.Helper.ALIGN_VERTICALLY);
        alignVerticallyReference.add(objArr);
        return alignVerticallyReference;
    }

    public void directMapping() {
        for (java.lang.Object obj : this.mReferences.keySet()) {
            androidx.constraintlayout.core.state.ConstraintReference constraintReferenceConstraints = constraints(obj);
            if (constraintReferenceConstraints instanceof androidx.constraintlayout.core.state.ConstraintReference) {
                constraintReferenceConstraints.setView(obj);
            }
        }
    }

    public void map(java.lang.Object obj, java.lang.Object obj2) {
        androidx.constraintlayout.core.state.ConstraintReference constraintReferenceConstraints = constraints(obj);
        if (constraintReferenceConstraints instanceof androidx.constraintlayout.core.state.ConstraintReference) {
            constraintReferenceConstraints.setView(obj2);
        }
    }

    public void setTag(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList<java.lang.String> arrayList;
        androidx.constraintlayout.core.state.ConstraintReference constraintReferenceConstraints = constraints(str);
        if (constraintReferenceConstraints instanceof androidx.constraintlayout.core.state.ConstraintReference) {
            constraintReferenceConstraints.setTag(str2);
            if (!this.mTags.containsKey(str2)) {
                arrayList = new java.util.ArrayList<>();
                this.mTags.put(str2, arrayList);
            } else {
                arrayList = this.mTags.get(str2);
            }
            arrayList.add(str);
        }
    }

    public java.util.ArrayList<java.lang.String> getIdsForTag(java.lang.String str) {
        if (this.mTags.containsKey(str)) {
            return this.mTags.get(str);
        }
        return null;
    }

    public void apply(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        androidx.constraintlayout.core.state.HelperReference helperReference;
        androidx.constraintlayout.core.widgets.HelperWidget helperWidget;
        androidx.constraintlayout.core.widgets.HelperWidget helperWidget2;
        constraintWidgetContainer.removeAllChildren();
        this.mParent.getWidth().apply(this, constraintWidgetContainer, 0);
        this.mParent.getHeight().apply(this, constraintWidgetContainer, 1);
        for (java.lang.Object obj : this.mHelperReferences.keySet()) {
            androidx.constraintlayout.core.widgets.HelperWidget helperWidget3 = this.mHelperReferences.get(obj).getHelperWidget();
            if (helperWidget3 != null) {
                androidx.constraintlayout.core.state.Reference referenceConstraints = this.mReferences.get(obj);
                if (referenceConstraints == null) {
                    referenceConstraints = constraints(obj);
                }
                referenceConstraints.setConstraintWidget(helperWidget3);
            }
        }
        for (java.lang.Object obj2 : this.mReferences.keySet()) {
            androidx.constraintlayout.core.state.Reference reference = this.mReferences.get(obj2);
            if (reference != this.mParent && (reference.getFacade() instanceof androidx.constraintlayout.core.state.HelperReference) && (helperWidget2 = ((androidx.constraintlayout.core.state.HelperReference) reference.getFacade()).getHelperWidget()) != null) {
                androidx.constraintlayout.core.state.Reference referenceConstraints2 = this.mReferences.get(obj2);
                if (referenceConstraints2 == null) {
                    referenceConstraints2 = constraints(obj2);
                }
                referenceConstraints2.setConstraintWidget(helperWidget2);
            }
        }
        java.util.Iterator<java.lang.Object> it = this.mReferences.keySet().iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.Reference reference2 = this.mReferences.get(it.next());
            if (reference2 != this.mParent) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = reference2.getConstraintWidget();
                constraintWidget.setDebugName(reference2.getKey().toString());
                constraintWidget.setParent(null);
                if (reference2.getFacade() instanceof androidx.constraintlayout.core.state.helpers.GuidelineReference) {
                    reference2.apply();
                }
                constraintWidgetContainer.add(constraintWidget);
            } else {
                reference2.setConstraintWidget(constraintWidgetContainer);
            }
        }
        java.util.Iterator<java.lang.Object> it2 = this.mHelperReferences.keySet().iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.core.state.HelperReference helperReference2 = this.mHelperReferences.get(it2.next());
            if (helperReference2.getHelperWidget() != null) {
                java.util.Iterator<java.lang.Object> it3 = helperReference2.mReferences.iterator();
                while (it3.hasNext()) {
                    helperReference2.getHelperWidget().add(this.mReferences.get(it3.next()).getConstraintWidget());
                }
                helperReference2.apply();
            } else {
                helperReference2.apply();
            }
        }
        java.util.Iterator<java.lang.Object> it4 = this.mReferences.keySet().iterator();
        while (it4.hasNext()) {
            androidx.constraintlayout.core.state.Reference reference3 = this.mReferences.get(it4.next());
            if (reference3 != this.mParent && (reference3.getFacade() instanceof androidx.constraintlayout.core.state.HelperReference) && (helperWidget = (helperReference = (androidx.constraintlayout.core.state.HelperReference) reference3.getFacade()).getHelperWidget()) != null) {
                for (java.lang.Object obj3 : helperReference.mReferences) {
                    androidx.constraintlayout.core.state.Reference reference4 = this.mReferences.get(obj3);
                    if (reference4 != null) {
                        helperWidget.add(reference4.getConstraintWidget());
                    } else if (obj3 instanceof androidx.constraintlayout.core.state.Reference) {
                        helperWidget.add(((androidx.constraintlayout.core.state.Reference) obj3).getConstraintWidget());
                    } else {
                        java.lang.System.out.println("couldn't find reference for " + obj3);
                    }
                }
                reference3.apply();
            }
        }
        for (java.lang.Object obj4 : this.mReferences.keySet()) {
            androidx.constraintlayout.core.state.Reference reference5 = this.mReferences.get(obj4);
            reference5.apply();
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = reference5.getConstraintWidget();
            if (constraintWidget2 != null && obj4 != null) {
                constraintWidget2.stringId = obj4.toString();
            }
        }
    }
}
