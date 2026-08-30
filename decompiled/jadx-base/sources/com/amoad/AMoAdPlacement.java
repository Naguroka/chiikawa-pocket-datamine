package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public enum AMoAdPlacement {
    TOP_RIGHT("TOP_RIGHT"),
    BOTTOM_RIGHT("BOTTOM_RIGHT"),
    TOP_LEFT("TOP_LEFT"),
    BOTTOM_LEFT("BOTTOM_LEFT");

    private static final java.util.EnumSet<com.amoad.AMoAdPlacement> rightPlacement;
    private static final java.util.EnumSet<com.amoad.AMoAdPlacement> topPlacement;
    private final java.lang.String name;

    static {
        com.amoad.AMoAdPlacement aMoAdPlacement = TOP_RIGHT;
        com.amoad.AMoAdPlacement aMoAdPlacement2 = BOTTOM_RIGHT;
        topPlacement = java.util.EnumSet.of(aMoAdPlacement, TOP_LEFT);
        rightPlacement = java.util.EnumSet.of(aMoAdPlacement, aMoAdPlacement2);
    }

    AMoAdPlacement(java.lang.String str) {
        this.name = str;
    }

    static com.amoad.AMoAdPlacement fromName(java.lang.String str) {
        for (com.amoad.AMoAdPlacement aMoAdPlacement : values()) {
            if (java.util.Objects.equals(str, aMoAdPlacement.name)) {
                return aMoAdPlacement;
            }
        }
        return TOP_RIGHT;
    }

    final void layout(android.view.View view, android.view.View view2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        java.util.EnumSet<com.amoad.AMoAdPlacement> enumSet = topPlacement;
        int top = enumSet.contains(this) ? view2.getTop() : view2.getBottom() - measuredHeight;
        int bottom = enumSet.contains(this) ? measuredHeight + top : view2.getBottom();
        java.util.EnumSet<com.amoad.AMoAdPlacement> enumSet2 = rightPlacement;
        int right = enumSet2.contains(this) ? view2.getRight() : view2.getLeft() + measuredWidth;
        view.layout(enumSet2.contains(this) ? right - measuredWidth : view2.getLeft(), top, right, bottom);
    }
}
