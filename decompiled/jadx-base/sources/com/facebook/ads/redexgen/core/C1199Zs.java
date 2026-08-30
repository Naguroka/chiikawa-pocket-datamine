package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1199Zs extends com.facebook.ads.redexgen.core.C7j {
    public static java.lang.String[] A06 = {"4Fl94EIzOk67aYUPduHJ8UazEL", "sAhktSZOOrm35xxj8Imdq8RPkj", "oRYwVa3KjTvntAfrBK1sqTqE8vcnrhu1", "DAigVkrFkMuOUy14T2FK5zmWgvJcIn3a", "an5oIaHMQLp81wCZBnKMJTBSx7KtQFJf", "wEWpxEoKGSO43ttKCSegU3t35jPnkl3s", "WpWdxAQuBweGThqHfmbUTgqTG7", "dWX8I2VlCkDjmK6jHvJYkvPP690yaesv"};
    public java.lang.ref.WeakReference<android.app.Activity> A00;
    public java.util.WeakHashMap<com.facebook.ads.internal.context.Repairable, java.lang.Boolean> A01;
    public final com.facebook.ads.redexgen.core.C04977g A02;
    public final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.InterfaceC04967f> A03;
    public final java.util.concurrent.atomic.AtomicReference<java.lang.Object> A04;
    public final java.util.concurrent.atomic.AtomicReference<com.facebook.ads.redexgen.core.C0S> A05;

    public C1199Zs(android.app.Activity activity, com.facebook.ads.redexgen.core.InterfaceC05017l interfaceC05017l, com.facebook.ads.redexgen.core.C0S c0s) {
        super(activity.getApplicationContext(), interfaceC05017l);
        this.A01 = new java.util.WeakHashMap<>();
        this.A05 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A03 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A02 = new com.facebook.ads.redexgen.core.C04977g();
        this.A04 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A05.set(c0s);
        this.A00 = new java.lang.ref.WeakReference<>(activity);
    }

    public C1199Zs(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC05017l interfaceC05017l, com.facebook.ads.redexgen.core.C0S c0s) {
        super(context.getApplicationContext(), interfaceC05017l);
        this.A01 = new java.util.WeakHashMap<>();
        this.A05 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A03 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A02 = new com.facebook.ads.redexgen.core.C04977g();
        this.A04 = new java.util.concurrent.atomic.AtomicReference<>();
        this.A05.set(c0s);
        android.app.Activity activityA00 = A00(context);
        if (activityA00 != null) {
            this.A00 = new java.lang.ref.WeakReference<>(activityA00);
        } else {
            this.A00 = new java.lang.ref.WeakReference<>(null);
        }
    }

    public static android.app.Activity A00(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            if ((context instanceof com.facebook.ads.redexgen.core.C1199Zs) && ((com.facebook.ads.redexgen.core.C1199Zs) context).A0D() != null) {
                return ((com.facebook.ads.redexgen.core.C1199Zs) context).A0D();
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final android.app.Activity A0D() {
        return this.A00.get();
    }

    public com.facebook.ads.redexgen.core.C0S A0E() {
        com.facebook.ads.redexgen.core.C0S funnel = this.A05.get();
        if (funnel == null) {
            return new com.facebook.ads.redexgen.core.C1378co();
        }
        return funnel;
    }

    public final com.facebook.ads.redexgen.core.InterfaceC04967f A0F() {
        return this.A03.get();
    }

    public final com.facebook.ads.redexgen.core.C04977g A0G() {
        return this.A02;
    }

    public final java.lang.Object A0H() {
        return this.A04.get();
    }

    public final void A0I(android.app.Activity activity) {
        this.A00 = new java.lang.ref.WeakReference<>(activity);
    }

    public final void A0J(com.facebook.ads.redexgen.core.C0S c0s) {
        this.A05.set(c0s);
    }

    public final void A0K(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        c1199Zs.A01.putAll(this.A01);
        this.A01 = c1199Zs.A01;
    }

    public final void A0L(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        A0J(c1199Zs.A0E());
        A0C(c1199Zs.A0B());
        A0M(c1199Zs.A0F());
    }

    public final void A0M(com.facebook.ads.redexgen.core.InterfaceC04967f interfaceC04967f) {
        this.A03.set(interfaceC04967f);
    }

    public final void A0N(com.facebook.ads.internal.context.Repairable repairable) {
        this.A01.put(repairable, true);
    }

    public final void A0O(java.lang.Object obj) {
        this.A04.set(obj);
    }

    public final void A0P(java.lang.Throwable th) {
        java.util.Iterator<java.util.Map.Entry<com.facebook.ads.internal.context.Repairable, java.lang.Boolean>> it = this.A01.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            java.lang.String[] strArr = A06;
            if (strArr[4].charAt(18) == strArr[2].charAt(18)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A06;
            strArr2[0] = "cq4W2mN05Su2gaFDi5CYFjM7nJ";
            strArr2[6] = "g7MgkZWMqMCaiMVBRzNoHUUy7c";
            if (zHasNext) {
                it.next().getKey().repair(th);
            } else {
                return;
            }
        }
    }
}
