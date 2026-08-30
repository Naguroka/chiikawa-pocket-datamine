package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class CheckableGroup<T extends com.google.android.material.internal.MaterialCheckable<T>> {
    private final java.util.Map<java.lang.Integer, T> checkables = new java.util.HashMap();
    private final java.util.Set<java.lang.Integer> checkedIds = new java.util.HashSet();
    private com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(java.util.Set<java.lang.Integer> set);
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearCheck();
        }
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void setSelectionRequired(boolean z) {
        this.selectionRequired = z;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public void setOnCheckedStateChangeListener(com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t) {
        this.checkables.put(java.lang.Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            checkInternal(t);
        }
        t.setInternalOnCheckedChangeListener(new com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public void onCheckedChanged(T t2, boolean z) {
                if (z) {
                    if (!com.google.android.material.internal.CheckableGroup.this.checkInternal(t2)) {
                        return;
                    }
                } else {
                    com.google.android.material.internal.CheckableGroup checkableGroup = com.google.android.material.internal.CheckableGroup.this;
                    if (!checkableGroup.uncheckInternal(t2, checkableGroup.selectionRequired)) {
                        return;
                    }
                }
                com.google.android.material.internal.CheckableGroup.this.onCheckedStateChanged();
            }
        });
    }

    public void removeCheckable(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(java.lang.Integer.valueOf(t.getId()));
        this.checkedIds.remove(java.lang.Integer.valueOf(t.getId()));
    }

    public void check(int i) {
        T t = this.checkables.get(java.lang.Integer.valueOf(i));
        if (t != null && checkInternal(t)) {
            onCheckedStateChanged();
        }
    }

    public void uncheck(int i) {
        T t = this.checkables.get(java.lang.Integer.valueOf(i));
        if (t != null && uncheckInternal(t, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean z = !this.checkedIds.isEmpty();
        java.util.Iterator<T> it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (z) {
            onCheckedStateChanged();
        }
    }

    public int getSingleCheckedId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public java.util.Set<java.lang.Integer> getCheckedIds() {
        return new java.util.HashSet(this.checkedIds);
    }

    public java.util.List<java.lang.Integer> getCheckedIdsSortedByChildOrder(android.view.ViewGroup viewGroup) {
        java.util.Set<java.lang.Integer> checkedIds = getCheckedIds();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof com.google.android.material.internal.MaterialCheckable) && checkedIds.contains(java.lang.Integer.valueOf(childAt.getId()))) {
                arrayList.add(java.lang.Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(com.google.android.material.internal.MaterialCheckable<T> materialCheckable) {
        int id = materialCheckable.getId();
        if (this.checkedIds.contains(java.lang.Integer.valueOf(id))) {
            return false;
        }
        T t = this.checkables.get(java.lang.Integer.valueOf(getSingleCheckedId()));
        if (t != null) {
            uncheckInternal(t, false);
        }
        boolean zAdd = this.checkedIds.add(java.lang.Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(com.google.android.material.internal.MaterialCheckable<T> materialCheckable, boolean z) {
        int id = materialCheckable.getId();
        if (!this.checkedIds.contains(java.lang.Integer.valueOf(id))) {
            return false;
        }
        if (z && this.checkedIds.size() == 1 && this.checkedIds.contains(java.lang.Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = this.checkedIds.remove(java.lang.Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }
}
