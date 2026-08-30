package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultItemAnimator extends androidx.recyclerview.widget.SimpleItemAnimator {
    private static final boolean DEBUG = false;
    private static android.animation.TimeInterpolator sDefaultInterpolator;
    private java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mPendingRemovals = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mPendingAdditions = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo> mPendingMoves = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo> mPendingChanges = new java.util.ArrayList<>();
    java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder>> mAdditionsList = new java.util.ArrayList<>();
    java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo>> mMovesList = new java.util.ArrayList<>();
    java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo>> mChangesList = new java.util.ArrayList<>();
    java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mAddAnimations = new java.util.ArrayList<>();
    java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mMoveAnimations = new java.util.ArrayList<>();
    java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mRemoveAnimations = new java.util.ArrayList<>();
    java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> mChangeAnimations = new java.util.ArrayList<>();

    private static class MoveInfo {
        public int fromX;
        public int fromY;
        public androidx.recyclerview.widget.RecyclerView.ViewHolder holder;
        public int toX;
        public int toY;

        MoveInfo(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.holder = viewHolder;
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }
    }

    private static class ChangeInfo {
        public int fromX;
        public int fromY;
        public androidx.recyclerview.widget.RecyclerView.ViewHolder newHolder;
        public androidx.recyclerview.widget.RecyclerView.ViewHolder oldHolder;
        public int toX;
        public int toY;

        private ChangeInfo(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2) {
            this.oldHolder = viewHolder;
            this.newHolder = viewHolder2;
        }

        ChangeInfo(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }

        public java.lang.String toString() {
            return "ChangeInfo{oldHolder=" + this.oldHolder + ", newHolder=" + this.newHolder + ", fromX=" + this.fromX + ", fromY=" + this.fromY + ", toX=" + this.toX + ", toY=" + this.toY + '}';
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            java.util.Iterator<androidx.recyclerview.widget.RecyclerView.ViewHolder> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.mPendingRemovals.clear();
            if (z2) {
                final java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo> arrayList = new java.util.ArrayList<>();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.1
                    @Override // java.lang.Runnable
                    public void run() {
                        for (androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo moveInfo : arrayList) {
                            androidx.recyclerview.widget.DefaultItemAnimator.this.animateMoveImpl(moveInfo.holder, moveInfo.fromX, moveInfo.fromY, moveInfo.toX, moveInfo.toY);
                        }
                        arrayList.clear();
                        androidx.recyclerview.widget.DefaultItemAnimator.this.mMovesList.remove(arrayList);
                    }
                };
                if (z) {
                    androidx.core.view.ViewCompat.postOnAnimationDelayed(arrayList.get(0).holder.itemView, runnable, getRemoveDuration());
                } else {
                    runnable.run();
                }
            }
            if (z3) {
                final java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo> arrayList2 = new java.util.ArrayList<>();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.2
                    @Override // java.lang.Runnable
                    public void run() {
                        java.util.Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            androidx.recyclerview.widget.DefaultItemAnimator.this.animateChangeImpl((androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo) it2.next());
                        }
                        arrayList2.clear();
                        androidx.recyclerview.widget.DefaultItemAnimator.this.mChangesList.remove(arrayList2);
                    }
                };
                if (z) {
                    androidx.core.view.ViewCompat.postOnAnimationDelayed(arrayList2.get(0).oldHolder.itemView, runnable2, getRemoveDuration());
                } else {
                    runnable2.run();
                }
            }
            if (z4) {
                final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList3 = new java.util.ArrayList<>();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                java.lang.Runnable runnable3 = new java.lang.Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.3
                    @Override // java.lang.Runnable
                    public void run() {
                        java.util.Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            androidx.recyclerview.widget.DefaultItemAnimator.this.animateAddImpl((androidx.recyclerview.widget.RecyclerView.ViewHolder) it2.next());
                        }
                        arrayList3.clear();
                        androidx.recyclerview.widget.DefaultItemAnimator.this.mAdditionsList.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    androidx.core.view.ViewCompat.postOnAnimationDelayed(arrayList3.get(0).itemView, runnable3, (z ? getRemoveDuration() : 0L) + java.lang.Math.max(z2 ? getMoveDuration() : 0L, z3 ? getChangeDuration() : 0L));
                } else {
                    runnable3.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateRemove(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        this.mPendingRemovals.add(viewHolder);
        return true;
    }

    private void animateRemoveImpl(final androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        final android.view.View view = viewHolder.itemView;
        final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mRemoveAnimations.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchRemoveStarting(viewHolder);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchRemoveFinished(viewHolder);
                androidx.recyclerview.widget.DefaultItemAnimator.this.mRemoveAnimations.remove(viewHolder);
                androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateAdd(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    void animateAddImpl(final androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        final android.view.View view = viewHolder.itemView;
        final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mAddAnimations.add(viewHolder);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchAddStarting(viewHolder);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchAddFinished(viewHolder);
                androidx.recyclerview.widget.DefaultItemAnimator.this.mAddAnimations.remove(viewHolder);
                androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateMove(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        android.view.View view = viewHolder.itemView;
        int translationX = i + ((int) viewHolder.itemView.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        resetAnimation(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.mPendingMoves.add(new androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    void animateMoveImpl(final androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        final android.view.View view = viewHolder.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mMoveAnimations.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchMoveStarting(viewHolder);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchMoveFinished(viewHolder);
                androidx.recyclerview.widget.DefaultItemAnimator.this.mMoveAnimations.remove(viewHolder);
                androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchFinishedWhenDone();
            }
        }).start();
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            resetAnimation(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i5);
            viewHolder2.itemView.setTranslationY(-i6);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    void animateChangeImpl(final androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo changeInfo) {
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = changeInfo.oldHolder;
        final android.view.View view = viewHolder == null ? null : viewHolder.itemView;
        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = changeInfo.newHolder;
        final android.view.View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
        if (view != null) {
            final android.view.ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(changeInfo.oldHolder);
            duration.translationX(changeInfo.toX - changeInfo.fromX);
            duration.translationY(changeInfo.toY - changeInfo.fromY);
            duration.alpha(0.0f).setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchChangeStarting(changeInfo.oldHolder, true);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchChangeFinished(changeInfo.oldHolder, true);
                    androidx.recyclerview.widget.DefaultItemAnimator.this.mChangeAnimations.remove(changeInfo.oldHolder);
                    androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
        if (view2 != null) {
            final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.mChangeAnimations.add(changeInfo.newHolder);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.8
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchChangeStarting(changeInfo.newHolder, false);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchChangeFinished(changeInfo.newHolder, false);
                    androidx.recyclerview.widget.DefaultItemAnimator.this.mChangeAnimations.remove(changeInfo.newHolder);
                    androidx.recyclerview.widget.DefaultItemAnimator.this.dispatchFinishedWhenDone();
                }
            }).start();
        }
    }

    private void endChangeAnimation(java.util.List<androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo> list, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo changeInfo = list.get(size);
            if (endChangeAnimationIfNecessary(changeInfo, viewHolder) && changeInfo.oldHolder == null && changeInfo.newHolder == null) {
                list.remove(changeInfo);
            }
        }
    }

    private void endChangeAnimationIfNecessary(androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo changeInfo) {
        if (changeInfo.oldHolder != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.oldHolder);
        }
        if (changeInfo.newHolder != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.newHolder);
        }
    }

    private boolean endChangeAnimationIfNecessary(androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo changeInfo, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (changeInfo.newHolder == viewHolder) {
            changeInfo.newHolder = null;
        } else {
            if (changeInfo.oldHolder != viewHolder) {
                return false;
            }
            changeInfo.oldHolder = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        android.view.View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).holder == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, viewHolder);
        if (this.mPendingRemovals.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.mPendingAdditions.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo> arrayList2 = this.mMovesList.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).holder == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.mMovesList.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(viewHolder);
        this.mAddAnimations.remove(viewHolder);
        this.mChangeAnimations.remove(viewHolder);
        this.mMoveAnimations.remove(viewHolder);
        dispatchFinishedWhenDone();
    }

    private void resetAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new android.animation.ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo moveInfo = this.mPendingMoves.get(size);
            android.view.View view = moveInfo.holder.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(moveInfo.holder);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = this.mPendingAdditions.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    androidx.recyclerview.widget.DefaultItemAnimator.MoveInfo moveInfo2 = arrayList.get(size6);
                    android.view.View view2 = moveInfo2.holder.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(moveInfo2.holder);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.ViewHolder> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                java.util.ArrayList<androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    void cancelAll(java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, java.util.List<java.lang.Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list);
    }
}
