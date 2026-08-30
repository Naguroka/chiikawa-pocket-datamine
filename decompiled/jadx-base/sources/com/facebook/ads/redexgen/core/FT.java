package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FT extends com.facebook.ads.redexgen.core.AbstractC1248af {
    public static android.animation.TimeInterpolator A0B;
    public static java.lang.String[] A0C = {"5", "w4FteHoxEZNBcBknXysU1QdwgOlgu", "XTfmSewcFvVIPqcU8HiF2JwhBroc2", "gTOT0dcLAsFp3JXaujmr6eSvv", "MioH3rC6822UBFONR3LUPujrkCbYq", "9Rk7JcSITmrZ17kamSQ7i6v9RKdnt", "plmSW6Ql", "PR6dCqey"};
    public java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> A0A = new java.util.ArrayList<>();
    public java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> A07 = new java.util.ArrayList<>();
    public java.util.ArrayList<com.facebook.ads.redexgen.core.C4M> A09 = new java.util.ArrayList<>();
    public java.util.ArrayList<com.facebook.ads.redexgen.core.C4L> A08 = new java.util.ArrayList<>();
    public java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56>> A01 = new java.util.ArrayList<>();
    public java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.core.C4M>> A05 = new java.util.ArrayList<>();
    public java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.core.C4L>> A03 = new java.util.ArrayList<>();
    public java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> A00 = new java.util.ArrayList<>();
    public java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> A04 = new java.util.ArrayList<>();
    public java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> A06 = new java.util.ArrayList<>();
    public java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> A02 = new java.util.ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final void A0I() {
        int size;
        for (int size2 = this.A09.size() - 1; size2 >= 0; size2--) {
            com.facebook.ads.redexgen.core.C4M c4m = this.A09.get(size2);
            android.view.View view = c4m.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(c4m.A04);
            this.A09.remove(size2);
        }
        for (int size3 = this.A0A.size() - 1; size3 >= 0; size3--) {
            A0P(this.A0A.get(size3));
            this.A0A.remove(size3);
        }
        for (int size4 = this.A07.size() - 1; size4 >= 0; size4--) {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56 = this.A07.get(size4);
            anonymousClass56.A0H.setAlpha(1.0f);
            A0N(anonymousClass56);
            this.A07.remove(size4);
        }
        for (int size5 = this.A08.size() - 1; size5 >= 0; size5--) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.C4L> arrayList = this.A08;
            java.lang.String[] strArr = A0C;
            if (strArr[0].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[4] = "IUveBZzBDFrSzC13ImzzVKkvQDdr2";
            strArr2[5] = "sCoWws78k8eiD0jPt8s7ggXNZv987";
            A01(arrayList.get(size5));
        }
        this.A08.clear();
        if (A0L()) {
            for (int size6 = this.A05.size() - 1; size6 >= 0; size6--) {
                java.util.ArrayList<com.facebook.ads.redexgen.core.C4M> arrayList2 = this.A05.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    com.facebook.ads.redexgen.core.C4M c4m2 = arrayList2.get(size7);
                    android.view.View view2 = c4m2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0O(c4m2.A04);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.A01.size() - 1; size8 >= 0; size8--) {
                java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> arrayList3 = this.A01.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57 = arrayList3.get(size9);
                    anonymousClass57.A0H.setAlpha(1.0f);
                    A0N(anonymousClass57);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56>> arrayList4 = this.A01;
                        java.lang.String[] strArr3 = A0C;
                        if (strArr3[0].length() != strArr3[3].length()) {
                            java.lang.String[] strArr4 = A0C;
                            strArr4[7] = "VBPMrKBD";
                            strArr4[6] = "WZFlfD4M";
                            arrayList4.remove(arrayList3);
                        } else {
                            arrayList4.remove(arrayList3);
                        }
                    }
                }
            }
            java.util.ArrayList<java.util.ArrayList<com.facebook.ads.redexgen.core.C4L>> arrayList5 = this.A03;
            java.lang.String[] strArr5 = A0C;
            if (strArr5[7].length() != strArr5[6].length()) {
                size = arrayList5.size() - 1;
            } else {
                java.lang.String[] strArr6 = A0C;
                strArr6[2] = "1rfkrkAxI3SWkdgenr27gUX73o6p1";
                strArr6[1] = "SSeA7srmTqf1oxxrlzMYS1BTDHSjo";
                size = arrayList5.size() - 1;
            }
            while (size >= 0) {
                java.util.ArrayList<com.facebook.ads.redexgen.core.C4L> arrayList6 = this.A03.get(size);
                for (int size10 = arrayList6.size() - 1; size10 >= 0; size10--) {
                    A01(arrayList6.get(size10));
                    if (arrayList6.isEmpty()) {
                        this.A03.remove(arrayList6);
                    }
                }
                size--;
            }
            A05(this.A06);
            A05(this.A04);
            A05(this.A00);
            A05(this.A02);
            A0A();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC1248af
    public final boolean A0T(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, int i, int i2, int i3, int i4) {
        android.view.View view = anonymousClass56.A0H;
        int translationX = i + ((int) anonymousClass56.A0H.getTranslationX());
        int translationY = i2 + ((int) anonymousClass56.A0H.getTranslationY());
        A04(anonymousClass56);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            A0O(anonymousClass56);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.A09.add(new com.facebook.ads.redexgen.core.C4M(anonymousClass56, translationX, translationY, i3, i4));
        return true;
    }

    private void A01(com.facebook.ads.redexgen.core.C4L c4l) {
        if (c4l.A05 != null) {
            A07(c4l, c4l.A05);
        }
        if (c4l.A04 != null) {
            A07(c4l, c4l.A04);
        }
    }

    private void A03(final com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        final android.view.View view = anonymousClass56.A0H;
        final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(anonymousClass56);
        android.view.ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A07());
        animation.alpha(0.0f).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4G
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                this.A02.A0P(anonymousClass56);
                this.A02.A06.remove(anonymousClass56);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(android.animation.Animator animator) {
            }
        }).start();
    }

    private void A04(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        if (A0B == null) {
            A0B = new android.animation.ValueAnimator().getInterpolator();
        }
        anonymousClass56.A0H.animate().setInterpolator(A0B);
        A0K(anonymousClass56);
    }

    private final void A05(java.util.List<com.facebook.ads.redexgen.core.AnonymousClass56> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(java.util.List<com.facebook.ads.redexgen.core.C4L> list, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        for (int size = list.size() - 1; size >= 0; size--) {
            com.facebook.ads.redexgen.core.C4L changeInfo = list.get(size);
            if (A07(changeInfo, anonymousClass56) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A07(com.facebook.ads.redexgen.core.C4L c4l, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        boolean z = false;
        if (c4l.A04 == anonymousClass56) {
            c4l.A04 = null;
        } else {
            com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57 = c4l.A05;
            java.lang.String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[0] = "F";
            strArr2[3] = "q2hYYatvKRTsdUwOPBYP5pb4s";
            if (anonymousClass57 == anonymousClass56) {
                c4l.A05 = null;
                z = true;
            } else {
                return false;
            }
        }
        anonymousClass56.A0H.setAlpha(1.0f);
        anonymousClass56.A0H.setTranslationX(0.0f);
        anonymousClass56.A0H.setTranslationY(0.0f);
        A0Q(anonymousClass56, z);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final void A0J() {
        boolean z = !this.A0A.isEmpty();
        boolean removalsPending = this.A09.isEmpty();
        boolean z2 = !removalsPending;
        boolean removalsPending2 = this.A08.isEmpty();
        boolean z3 = !removalsPending2;
        boolean removalsPending3 = this.A07.isEmpty();
        boolean z4 = !removalsPending3;
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        java.util.Iterator<com.facebook.ads.redexgen.core.AnonymousClass56> it = this.A0A.iterator();
        while (removalsPending) {
            A03(it.next());
        }
        this.A0A.clear();
        if (z2) {
            final java.util.ArrayList<com.facebook.ads.redexgen.core.C4M> arrayList = new java.util.ArrayList<>();
            arrayList.addAll(this.A09);
            this.A05.add(arrayList);
            this.A09.clear();
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.4D
                @Override // java.lang.Runnable
                public final void run() {
                    for (com.facebook.ads.redexgen.core.C4M c4m : arrayList) {
                        this.A00.A0Y(c4m.A04, c4m.A00, c4m.A01, c4m.A02, c4m.A03);
                    }
                    arrayList.clear();
                    this.A00.A05.remove(arrayList);
                }
            };
            if (z) {
                com.facebook.ads.redexgen.core.C3T.A0E(arrayList.get(0).A04.A0H, runnable, A07());
            } else {
                runnable.run();
            }
        }
        if (z3) {
            final java.util.ArrayList<com.facebook.ads.redexgen.core.C4L> arrayList2 = new java.util.ArrayList<>();
            arrayList2.addAll(this.A08);
            this.A03.add(arrayList2);
            this.A08.clear();
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.4E
                @Override // java.lang.Runnable
                public final void run() {
                    for (com.facebook.ads.redexgen.core.C4L change : arrayList2) {
                        this.A00.A0W(change);
                    }
                    arrayList2.clear();
                    this.A00.A03.remove(arrayList2);
                }
            };
            if (z) {
                com.facebook.ads.redexgen.core.C3T.A0E(arrayList2.get(0).A05.A0H, runnable2, A07());
            } else {
                runnable2.run();
            }
        }
        if (z4) {
            final java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> arrayList3 = new java.util.ArrayList<>();
            arrayList3.addAll(this.A07);
            this.A01.add(arrayList3);
            this.A07.clear();
            java.lang.Runnable runnable3 = new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.4F
                @Override // java.lang.Runnable
                public final void run() {
                    for (com.facebook.ads.redexgen.core.AnonymousClass56 holder : arrayList3) {
                        this.A00.A0X(holder);
                    }
                    arrayList3.clear();
                    this.A00.A01.remove(arrayList3);
                }
            };
            if (z || z2 || z3) {
                com.facebook.ads.redexgen.core.C3T.A0E(arrayList3.get(0).A0H, runnable3, java.lang.Math.max(z2 ? A06() : 0L, z3 ? A05() : 0L) + (z ? A07() : 0L));
            } else {
                runnable3.run();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final void A0K(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        android.view.View view = anonymousClass56.A0H;
        view.animate().cancel();
        for (int i = this.A09.size() - 1; i >= 0; i--) {
            if (this.A09.get(i).A04 == anonymousClass56) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(anonymousClass56);
                this.A09.remove(i);
            }
        }
        A06(this.A08, anonymousClass56);
        if (this.A0A.remove(anonymousClass56)) {
            view.setAlpha(1.0f);
            A0P(anonymousClass56);
        }
        if (this.A07.remove(anonymousClass56)) {
            view.setAlpha(1.0f);
            java.lang.String[] strArr = A0C;
            if (strArr[2].length() != strArr[1].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[4] = "yxRUaByjpu2evyevZXzo5CX3I8dRP";
            strArr2[5] = "IuT2zeZcrCaCkdpAEhiSgQgKuQzMH";
            A0N(anonymousClass56);
        }
        for (int i2 = this.A03.size() - 1; i2 >= 0; i2--) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.C4L> arrayList = this.A03.get(i2);
            A06(arrayList, anonymousClass56);
            if (arrayList.isEmpty()) {
                this.A03.remove(i2);
            }
        }
        for (int size = this.A05.size() - 1; size >= 0; size--) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.C4M> arrayList2 = this.A05.get(size);
            for (int i3 = arrayList2.size() - 1; i3 >= 0; i3--) {
                if (arrayList2.get(i3).A04 == anonymousClass56) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0O(anonymousClass56);
                    arrayList2.remove(i3);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.A05.remove(size);
                    break;
                }
            }
        }
        for (int size2 = this.A01.size() - 1; size2 >= 0; size2--) {
            java.util.ArrayList<com.facebook.ads.redexgen.core.AnonymousClass56> arrayList3 = this.A01.get(size2);
            if (arrayList3.remove(anonymousClass56)) {
                view.setAlpha(1.0f);
                A0N(anonymousClass56);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(size2);
                }
            }
        }
        this.A06.remove(anonymousClass56);
        this.A00.remove(anonymousClass56);
        this.A02.remove(anonymousClass56);
        this.A04.remove(anonymousClass56);
        A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final boolean A0L() {
        return (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04304k
    public final boolean A0M(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, java.util.List<java.lang.Object> payloads) {
        return !payloads.isEmpty() || super.A0M(anonymousClass56, payloads);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1248af
    public final boolean A0R(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        A04(anonymousClass56);
        anonymousClass56.A0H.setAlpha(0.0f);
        this.A07.add(anonymousClass56);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1248af
    public final boolean A0S(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        A04(anonymousClass56);
        this.A0A.add(anonymousClass56);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1248af
    public final boolean A0U(com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass57, int i, int i2, int i3, int i4) {
        if (anonymousClass56 == anonymousClass57) {
            return A0T(anonymousClass56, i, i2, i3, i4);
        }
        float translationX = anonymousClass56.A0H.getTranslationX();
        float translationY = anonymousClass56.A0H.getTranslationY();
        float prevTranslationY = anonymousClass56.A0H.getAlpha();
        A04(anonymousClass56);
        float prevTranslationX = i3 - i;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i4 - i2;
        int deltaX = (int) (prevTranslationX2 - translationY);
        anonymousClass56.A0H.setTranslationX(translationX);
        anonymousClass56.A0H.setTranslationY(translationY);
        anonymousClass56.A0H.setAlpha(prevTranslationY);
        if (anonymousClass57 != null) {
            A04(anonymousClass57);
            float prevTranslationX3 = -deltaY;
            anonymousClass57.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            anonymousClass57.A0H.setTranslationY(prevTranslationX4);
            anonymousClass57.A0H.setAlpha(0.0f);
        }
        this.A08.add(new com.facebook.ads.redexgen.core.C4L(anonymousClass56, anonymousClass57, i, i2, i3, i4));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final com.facebook.ads.redexgen.core.C4L c4l) {
        final android.view.View view;
        com.facebook.ads.redexgen.core.AnonymousClass56 holder = c4l.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        com.facebook.ads.redexgen.core.AnonymousClass56 holder2 = c4l.A04;
        final android.view.View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            final android.view.ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A05());
            this.A02.add(c4l.A05);
            oldViewAnim.translationX(c4l.A02 - c4l.A00);
            oldViewAnim.translationY(c4l.A03 - c4l.A01);
            oldViewAnim.alpha(0.0f).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4J
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(android.animation.Animator animator) {
                    oldViewAnim.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    this.A03.A0Q(c4l.A05, true);
                    this.A03.A02.remove(c4l.A05);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(android.animation.Animator animator) {
                }
            }).start();
        }
        if (view2 != null) {
            final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(c4l.A04);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4K
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(android.animation.Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    this.A03.A0Q(c4l.A04, false);
                    this.A03.A02.remove(c4l.A04);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(android.animation.Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56) {
        final android.view.View view = anonymousClass56.A0H;
        final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(anonymousClass56);
        android.view.ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A04());
        animation.setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4H
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(android.animation.Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A02.A0N(anonymousClass56);
                this.A02.A00.remove(anonymousClass56);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(android.animation.Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final com.facebook.ads.redexgen.core.AnonymousClass56 anonymousClass56, int i, int i2, int i3, int i4) {
        final android.view.View view = anonymousClass56.A0H;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(anonymousClass56);
        viewPropertyAnimatorAnimate.setDuration(A06()).setListener(new android.animation.AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.4I
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(android.animation.Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(android.animation.Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A04.A0O(anonymousClass56);
                this.A04.A04.remove(anonymousClass56);
                this.A04.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(android.animation.Animator animator) {
            }
        }).start();
    }
}
