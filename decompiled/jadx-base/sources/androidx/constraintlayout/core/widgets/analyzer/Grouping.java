package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
public class Grouping {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_GROUPING = false;

    public static boolean validInGroup(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour3, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        return (dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) || (dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT));
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0356  */
    public static boolean simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer) {
        androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup;
        boolean z;
        boolean z2;
        androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup2;
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = children.get(i2);
            if (!validInGroup(constraintWidgetContainer.getHorizontalDimensionBehaviour(), constraintWidgetContainer.getVerticalDimensionBehaviour(), constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getVerticalDimensionBehaviour()) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Flow)) {
                return false;
            }
        }
        if (constraintWidgetContainer.mMetrics != null) {
            constraintWidgetContainer.mMetrics.grouping++;
        }
        int i3 = 0;
        java.util.ArrayList arrayList = null;
        java.util.ArrayList<androidx.constraintlayout.core.widgets.HelperWidget> arrayList2 = null;
        java.util.ArrayList arrayList3 = null;
        java.util.ArrayList<androidx.constraintlayout.core.widgets.HelperWidget> arrayList4 = null;
        java.util.ArrayList arrayList5 = null;
        java.util.ArrayList arrayList6 = null;
        while (i3 < size) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = children.get(i3);
            if (!validInGroup(constraintWidgetContainer.getHorizontalDimensionBehaviour(), constraintWidgetContainer.getVerticalDimensionBehaviour(), constraintWidget2.getHorizontalDimensionBehaviour(), constraintWidget2.getVerticalDimensionBehaviour())) {
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(i, constraintWidget2, measurer, constraintWidgetContainer.mMeasure, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
            }
            boolean z3 = constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Guideline;
            if (z3) {
                androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget2;
                if (guideline.getOrientation() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                    }
                    arrayList3.add(guideline);
                }
                if (guideline.getOrientation() == 1) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(guideline);
                }
            }
            if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.HelperWidget) {
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) constraintWidget2;
                    if (barrier.getOrientation() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new java.util.ArrayList();
                        }
                        arrayList2.add(barrier);
                    }
                    if (barrier.getOrientation() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new java.util.ArrayList();
                        }
                        arrayList4.add(barrier);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.HelperWidget helperWidget = (androidx.constraintlayout.core.widgets.HelperWidget) constraintWidget2;
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    arrayList2.add(helperWidget);
                    if (arrayList4 == null) {
                        arrayList4 = new java.util.ArrayList();
                    }
                    arrayList4.add(helperWidget);
                }
            }
            if (constraintWidget2.mLeft.mTarget == null && constraintWidget2.mRight.mTarget == null && !z3 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                if (arrayList5 == null) {
                    arrayList5 = new java.util.ArrayList();
                }
                arrayList5.add(constraintWidget2);
            }
            if (constraintWidget2.mTop.mTarget == null && constraintWidget2.mBottom.mTarget == null && constraintWidget2.mBaseline.mTarget == null && !z3 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                if (arrayList6 == null) {
                    arrayList6 = new java.util.ArrayList();
                }
                arrayList6.add(constraintWidget2);
            }
            i3++;
            i = 0;
        }
        java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList7 = new java.util.ArrayList<>();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                findDependents((androidx.constraintlayout.core.widgets.Guideline) it.next(), 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup3 = null;
        int i4 = 0;
        if (arrayList2 != null) {
            for (androidx.constraintlayout.core.widgets.HelperWidget helperWidget2 : arrayList2) {
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroupFindDependents = findDependents(helperWidget2, i4, arrayList7, widgetGroup3);
                helperWidget2.addDependents(arrayList7, i4, widgetGroupFindDependents);
                widgetGroupFindDependents.cleanup(arrayList7);
                widgetGroup3 = null;
                i4 = 0;
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        if (anchor.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it2 = anchor.getDependents().iterator();
            while (it2.hasNext()) {
                findDependents(it2.next().mOwner, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor2 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        if (anchor2.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it3 = anchor2.getDependents().iterator();
            while (it3.hasNext()) {
                findDependents(it3.next().mOwner, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor3 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        if (anchor3.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it4 = anchor3.getDependents().iterator();
            while (it4.hasNext()) {
                findDependents(it4.next().mOwner, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup4 = null;
        if (arrayList5 != null) {
            java.util.Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                findDependents((androidx.constraintlayout.core.widgets.ConstraintWidget) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                findDependents((androidx.constraintlayout.core.widgets.Guideline) it6.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            for (androidx.constraintlayout.core.widgets.HelperWidget helperWidget3 : arrayList4) {
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroupFindDependents2 = findDependents(helperWidget3, i5, arrayList7, widgetGroup4);
                helperWidget3.addDependents(arrayList7, i5, widgetGroupFindDependents2);
                widgetGroupFindDependents2.cleanup(arrayList7);
                widgetGroup4 = null;
                i5 = 1;
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor4 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        if (anchor4.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it7 = anchor4.getDependents().iterator();
            while (it7.hasNext()) {
                findDependents(it7.next().mOwner, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor5 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
        if (anchor5.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it8 = anchor5.getDependents().iterator();
            while (it8.hasNext()) {
                findDependents(it8.next().mOwner, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor6 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        if (anchor6.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it9 = anchor6.getDependents().iterator();
            while (it9.hasNext()) {
                findDependents(it9.next().mOwner, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor7 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        if (anchor7.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it10 = anchor7.getDependents().iterator();
            while (it10.hasNext()) {
                findDependents(it10.next().mOwner, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            java.util.Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                findDependents((androidx.constraintlayout.core.widgets.ConstraintWidget) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = children.get(i6);
            if (constraintWidget3.oppositeDimensionsTied()) {
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroupFindGroup = findGroup(arrayList7, constraintWidget3.horizontalGroup);
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroupFindGroup2 = findGroup(arrayList7, constraintWidget3.verticalGroup);
                if (widgetGroupFindGroup != null && widgetGroupFindGroup2 != null) {
                    widgetGroupFindGroup.moveTo(0, widgetGroupFindGroup2);
                    widgetGroupFindGroup2.setOrientation(2);
                    arrayList7.remove(widgetGroupFindGroup);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (constraintWidgetContainer.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            widgetGroup = null;
            int i7 = 0;
            for (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup5 : arrayList7) {
                if (widgetGroup5.getOrientation() != 1) {
                    widgetGroup5.setAuthoritative(false);
                    int iMeasureWrap = widgetGroup5.measureWrap(constraintWidgetContainer.getSystem(), 0);
                    if (iMeasureWrap > i7) {
                        widgetGroup = widgetGroup5;
                        i7 = iMeasureWrap;
                    }
                }
            }
            if (widgetGroup != null) {
                constraintWidgetContainer.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.setWidth(i7);
                widgetGroup.setAuthoritative(true);
            } else {
                widgetGroup = null;
            }
        } else {
            widgetGroup = null;
        }
        if (constraintWidgetContainer.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup6 = null;
            int i8 = 0;
            for (androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup7 : arrayList7) {
                if (widgetGroup7.getOrientation() != 0) {
                    widgetGroup7.setAuthoritative(false);
                    int iMeasureWrap2 = widgetGroup7.measureWrap(constraintWidgetContainer.getSystem(), 1);
                    if (iMeasureWrap2 > i8) {
                        widgetGroup6 = widgetGroup7;
                        i8 = iMeasureWrap2;
                    }
                }
            }
            z = false;
            z2 = true;
            if (widgetGroup6 != null) {
                constraintWidgetContainer.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.setHeight(i8);
                widgetGroup6.setAuthoritative(true);
                widgetGroup2 = widgetGroup6;
            }
            return (widgetGroup == null || widgetGroup2 != null) ? z2 : z;
        }
        z = false;
        z2 = true;
        widgetGroup2 = null;
        if (widgetGroup == null) {
        }
    }

    private static androidx.constraintlayout.core.widgets.analyzer.WidgetGroup findGroup(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup = arrayList.get(i2);
            if (i == widgetGroup.id) {
                return widgetGroup;
            }
        }
        return null;
    }

    public static androidx.constraintlayout.core.widgets.analyzer.WidgetGroup findDependents(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup) {
        int i2;
        int iFindGroupInDependents;
        if (i == 0) {
            i2 = constraintWidget.horizontalGroup;
        } else {
            i2 = constraintWidget.verticalGroup;
        }
        if (i2 != -1 && (widgetGroup == null || i2 != widgetGroup.id)) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup2 = arrayList.get(i3);
                if (widgetGroup2.getId() == i2) {
                    if (widgetGroup != null) {
                        widgetGroup.moveTo(i, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                    break;
                }
            }
        } else if (i2 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.HelperWidget) && (iFindGroupInDependents = ((androidx.constraintlayout.core.widgets.HelperWidget) constraintWidget).findGroupInDependents(i)) != -1) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup3 = arrayList.get(i4);
                    if (widgetGroup3.getId() == iFindGroupInDependents) {
                        widgetGroup = widgetGroup3;
                        break;
                    }
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new androidx.constraintlayout.core.widgets.analyzer.WidgetGroup(i);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.add(constraintWidget)) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
                androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
                guideline.getAnchor().findDependents(guideline.getOrientation() == 0 ? 1 : 0, arrayList, widgetGroup);
            }
            if (i == 0) {
                constraintWidget.horizontalGroup = widgetGroup.getId();
                constraintWidget.mLeft.findDependents(i, arrayList, widgetGroup);
                constraintWidget.mRight.findDependents(i, arrayList, widgetGroup);
            } else {
                constraintWidget.verticalGroup = widgetGroup.getId();
                constraintWidget.mTop.findDependents(i, arrayList, widgetGroup);
                constraintWidget.mBaseline.findDependents(i, arrayList, widgetGroup);
                constraintWidget.mBottom.findDependents(i, arrayList, widgetGroup);
            }
            constraintWidget.mCenter.findDependents(i, arrayList, widgetGroup);
        }
        return widgetGroup;
    }
}
