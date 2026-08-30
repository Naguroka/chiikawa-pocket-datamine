package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Map f1556a = new java.util.HashMap(2);

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return true;
    }

    public static boolean h() {
        return true;
    }

    public static boolean i() {
        return android.os.Build.VERSION.SDK_INT >= 26;
    }

    public static boolean j() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    public static boolean k() {
        return android.os.Build.VERSION.SDK_INT >= 29;
    }

    public static boolean l() {
        return android.os.Build.VERSION.SDK_INT >= 33;
    }

    public static boolean m() {
        return android.os.Build.VERSION.SDK_INT >= 31;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1557a;
        int b;
        int c;
        int d;

        public java.lang.String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        /* JADX INFO: renamed from: com.applovin.impl.z3$a$a, reason: collision with other inner class name */
        public static class C0061a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f1558a;
            private int b;
            private int c;
            private int d;

            C0061a() {
            }

            public java.lang.String toString() {
                return "CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=" + this.f1558a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ")";
            }

            public com.applovin.impl.z3.a.C0061a a(int i) {
                this.c = i;
                return this;
            }

            public com.applovin.impl.z3.a.C0061a b(int i) {
                this.d = i;
                return this;
            }

            public com.applovin.impl.z3.a.C0061a c(int i) {
                this.f1558a = i;
                return this;
            }

            public com.applovin.impl.z3.a.C0061a d(int i) {
                this.b = i;
                return this;
            }

            public com.applovin.impl.z3.a a() {
                return new com.applovin.impl.z3.a(this.f1558a, this.b, this.c, this.d);
            }
        }

        protected boolean a(java.lang.Object obj) {
            return obj instanceof com.applovin.impl.z3.a;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.impl.z3.a)) {
                return false;
            }
            com.applovin.impl.z3.a aVar = (com.applovin.impl.z3.a) obj;
            return aVar.a(this) && c() == aVar.c() && d() == aVar.d() && a() == aVar.a() && b() == aVar.b();
        }

        public int hashCode() {
            return ((((((c() + 59) * 59) + d()) * 59) + a()) * 59) + b();
        }

        a(int i, int i2, int i3, int i4) {
            this.f1557a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public int c() {
            return this.f1557a;
        }

        public int d() {
            return this.b;
        }

        public int b() {
            return this.d;
        }

        public int a() {
            return this.c;
        }
    }

    public static android.graphics.Point b(android.content.Context context) {
        int orientation = com.applovin.sdk.AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        boolean z = jVar == null || ((java.lang.Boolean) jVar.a(com.applovin.impl.sj.l6)).booleanValue();
        if (!c(context) || z) {
            java.util.Map map = f1556a;
            if (map.containsKey(java.lang.Integer.valueOf(orientation))) {
                return (android.graphics.Point) map.get(java.lang.Integer.valueOf(orientation));
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        point.x = 480;
        point.y = 320;
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                android.graphics.Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
                point = new android.graphics.Point(bounds.width(), bounds.height());
            } else if (d()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        android.os.StrictMode.setVmPolicy(vmPolicy);
        f1556a.put(java.lang.Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean b() {
        return android.os.Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean c() {
        return android.os.Build.VERSION.SDK_INT >= 34;
    }

    public static android.graphics.Point a(android.content.Context context) {
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        android.graphics.Point point = new android.graphics.Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        android.os.StrictMode.setVmPolicy(vmPolicy);
        return point;
    }

    private static int a(int i, android.view.Display display) {
        android.view.RoundedCorner roundedCorner = display.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static com.applovin.impl.z3.a a(android.content.Context context, com.applovin.impl.sdk.j jVar) {
        com.applovin.impl.z3.a aVarA = null;
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.X3)).booleanValue() && m()) {
            android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
            android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                    aVarA = new com.applovin.impl.z3.a.C0061a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
                } catch (java.lang.Throwable unused) {
                }
            }
            android.os.StrictMode.setVmPolicy(vmPolicy);
        }
        return aVarA;
    }

    public static boolean a(java.lang.String str, android.content.Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static void a() {
        try {
            android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (java.lang.Throwable unused) {
        }
    }
}
