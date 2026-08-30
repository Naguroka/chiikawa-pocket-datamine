package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zq {
    public static boolean b(int i) {
        return i == 0;
    }

    public static void a(android.view.View view, long j) {
        a(view, j, (java.lang.Runnable) null);
    }

    class a implements android.view.animation.Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f1578a;
        final /* synthetic */ java.lang.Runnable b;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation animation) {
        }

        a(android.view.View view, java.lang.Runnable runnable) {
            this.f1578a = view;
            this.b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation animation) {
            this.f1578a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation animation) {
            java.lang.Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void a(android.view.View view, long j, java.lang.Runnable runnable) {
        view.setVisibility(4);
        view.bringToFront();
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new com.applovin.impl.zq.a(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    public static void b(android.view.View view, long j, java.lang.Runnable runnable) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new com.applovin.impl.zq.b(view, runnable));
        view.startAnimation(alphaAnimation);
    }

    class b implements android.view.animation.Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.view.View f1579a;
        final /* synthetic */ java.lang.Runnable b;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(android.view.animation.Animation animation) {
        }

        b(android.view.View view, java.lang.Runnable runnable) {
            this.f1579a = view;
            this.b = runnable;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(android.view.animation.Animation animation) {
            this.f1579a.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(android.view.animation.Animation animation) {
            this.f1579a.setVisibility(4);
            java.lang.Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void c(android.view.View view) {
        if (view == null) {
            return;
        }
        android.view.ViewParent parent = view.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    public static int[] a(int i, int i2, int i3) {
        if (i == 0) {
            return new int[]{i2, i3};
        }
        if ((i & 119) == 119) {
            return new int[]{13};
        }
        if ((i & 112) == 112) {
            i2 = 15;
        } else if ((i & 48) == 48) {
            i2 = 10;
        } else if ((i & 80) == 80) {
            i2 = 12;
        } else if ((i & 16) == 16) {
            i2 = 15;
        }
        if ((i & 7) == 7) {
            i3 = 14;
        } else if (com.applovin.impl.z3.d() && (i & androidx.core.view.GravityCompat.START) == 8388611) {
            i3 = 20;
        } else if ((i & 3) == 3) {
            i3 = 9;
        } else if (com.applovin.impl.z3.d() && (i & androidx.core.view.GravityCompat.END) == 8388613) {
            i3 = 21;
        } else if ((i & 5) == 5) {
            i3 = 11;
        } else if ((i & 1) == 1) {
            i3 = 14;
        }
        return new int[]{i3, i2};
    }

    public static android.view.View b(android.view.View view) {
        android.view.View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        android.view.View viewFindViewById = rootView.findViewById(android.R.id.content);
        return viewFindViewById != null ? viewFindViewById : rootView;
    }

    public static java.lang.String a(int i) {
        if (i == 0) {
            return "VISIBLE";
        }
        if (i == 4) {
            return "INVISIBLE";
        }
        return i == 8 ? "GONE" : java.lang.String.valueOf(i);
    }

    public static boolean a(int i, int i2) {
        return b(i) != b(i2);
    }

    private static boolean a(android.view.View view, android.view.View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (a(view, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(android.view.View view, android.app.Activity activity) {
        if (activity != null && view != null) {
            android.view.Window window = activity.getWindow();
            if (window != null) {
                return a(view, window.getDecorView());
            }
            android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
            if (viewFindViewById != null) {
                return a(view, viewFindViewById.getRootView());
            }
        }
        return false;
    }

    public static android.app.Activity a(android.view.View view, com.applovin.impl.sdk.j jVar) {
        if (view == null) {
            return null;
        }
        for (int i = 0; i < 1000; i++) {
            try {
                android.content.Context context = view.getContext();
                if (context instanceof android.app.Activity) {
                    return (android.app.Activity) context;
                }
                java.lang.Object parent = view.getParent();
                if (!(parent instanceof android.view.View)) {
                    return null;
                }
                view = (android.view.View) parent;
            } catch (java.lang.Throwable th) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.I().a("ViewUtils", "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static java.lang.String a(android.view.View view) {
        return view.getClass().getName() + '@' + java.lang.Integer.toHexString(view.hashCode());
    }
}
