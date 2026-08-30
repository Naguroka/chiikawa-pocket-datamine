package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public class AMoAdNativeMainVideoView extends android.widget.RelativeLayout {
    private static final java.lang.String e = "AMoAdNativeMainVideoView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.amoad.i f137a;
    com.amoad.NativeVideoView b;
    boolean c;
    com.amoad.f d;
    private android.widget.TextView f;
    private com.amoad.ay g;
    private android.os.Handler h;
    private com.amoad.AMoAdNativeMainVideoView.Listener i;
    private final com.amoad.NativeVideoView.a j;
    private final com.amoad.NativeVideoView.b k;
    private android.view.View.OnClickListener l;

    /* JADX INFO: renamed from: com.amoad.AMoAdNativeMainVideoView$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f144a;

        static {
            int[] iArr = new int[com.amoad.NativeVideoView.State.values().length];
            f144a = iArr;
            try {
                iArr[com.amoad.NativeVideoView.State.Playing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f144a[com.amoad.NativeVideoView.State.PlaybackCompleted.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f144a[com.amoad.NativeVideoView.State.Error.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public interface Listener {
        void onComplete(com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView);

        void onFailed(com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView);

        void onStart(com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView);
    }

    public AMoAdNativeMainVideoView(android.content.Context context) {
        this(context, null, 0);
    }

    public AMoAdNativeMainVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AMoAdNativeMainVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.j = new com.amoad.NativeVideoView.a() { // from class: com.amoad.AMoAdNativeMainVideoView.1
            @Override // com.amoad.NativeVideoView.a
            public final void a() {
                com.amoad.AMoAdNativeMainVideoView.a(com.amoad.AMoAdNativeMainVideoView.this);
                com.amoad.AMoAdNativeMainVideoView.b(com.amoad.AMoAdNativeMainVideoView.this);
            }
        };
        this.k = new com.amoad.NativeVideoView.b() { // from class: com.amoad.AMoAdNativeMainVideoView.2
            @Override // com.amoad.NativeVideoView.b
            public final void a(com.amoad.NativeVideoView.State state) {
                com.amoad.AMoAdNativeMainVideoView.this.d();
                int i2 = com.amoad.AMoAdNativeMainVideoView.AnonymousClass7.f144a[state.ordinal()];
                if (i2 == 1) {
                    com.amoad.AMoAdNativeMainVideoView.d(com.amoad.AMoAdNativeMainVideoView.this);
                } else if (i2 == 2) {
                    com.amoad.AMoAdNativeMainVideoView.e(com.amoad.AMoAdNativeMainVideoView.this);
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    com.amoad.AMoAdNativeMainVideoView.f(com.amoad.AMoAdNativeMainVideoView.this);
                }
            }
        };
        this.l = new android.view.View.OnClickListener() { // from class: com.amoad.AMoAdNativeMainVideoView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.amoad.NativeVideoView nativeVideoView = com.amoad.AMoAdNativeMainVideoView.this.b;
                com.amoad.NativeVideoView.g();
                if (nativeVideoView.f174a.g()) {
                    nativeVideoView.f174a.a(0);
                    nativeVideoView.h = false;
                    nativeVideoView.f();
                }
            }
        };
        a(context);
    }

    public AMoAdNativeMainVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = false;
        this.j = new com.amoad.NativeVideoView.a() { // from class: com.amoad.AMoAdNativeMainVideoView.1
            @Override // com.amoad.NativeVideoView.a
            public final void a() {
                com.amoad.AMoAdNativeMainVideoView.a(com.amoad.AMoAdNativeMainVideoView.this);
                com.amoad.AMoAdNativeMainVideoView.b(com.amoad.AMoAdNativeMainVideoView.this);
            }
        };
        this.k = new com.amoad.NativeVideoView.b() { // from class: com.amoad.AMoAdNativeMainVideoView.2
            @Override // com.amoad.NativeVideoView.b
            public final void a(com.amoad.NativeVideoView.State state) {
                com.amoad.AMoAdNativeMainVideoView.this.d();
                int i3 = com.amoad.AMoAdNativeMainVideoView.AnonymousClass7.f144a[state.ordinal()];
                if (i3 == 1) {
                    com.amoad.AMoAdNativeMainVideoView.d(com.amoad.AMoAdNativeMainVideoView.this);
                } else if (i3 == 2) {
                    com.amoad.AMoAdNativeMainVideoView.e(com.amoad.AMoAdNativeMainVideoView.this);
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    com.amoad.AMoAdNativeMainVideoView.f(com.amoad.AMoAdNativeMainVideoView.this);
                }
            }
        };
        this.l = new android.view.View.OnClickListener() { // from class: com.amoad.AMoAdNativeMainVideoView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.amoad.NativeVideoView nativeVideoView = com.amoad.AMoAdNativeMainVideoView.this.b;
                com.amoad.NativeVideoView.g();
                if (nativeVideoView.f174a.g()) {
                    nativeVideoView.f174a.a(0);
                    nativeVideoView.h = false;
                    nativeVideoView.f();
                }
            }
        };
        a(context);
    }

    private int a(int i) {
        return (int) java.lang.Math.ceil(i * getResources().getDisplayMetrics().density);
    }

    private android.widget.RelativeLayout.LayoutParams a() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        if (this.c) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (this.f137a.y < this.f137a.x) {
                layoutParams.height = (displayMetrics.widthPixels * this.f137a.y) / this.f137a.x;
            } else {
                layoutParams.width = (displayMetrics.heightPixels * this.f137a.x) / this.f137a.y;
            }
        }
        return layoutParams;
    }

    private void a(android.content.Context context) {
        com.amoad.f fVar = new com.amoad.f(context);
        this.d = fVar;
        fVar.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        addView(this.d, 0, a());
        android.widget.TextView textViewB = b(context);
        this.f = textViewB;
        addView(textViewB, 0, b());
        com.amoad.NativeVideoView nativeVideoView = new com.amoad.NativeVideoView(context);
        this.b = nativeVideoView;
        nativeVideoView.a(this.k);
        this.b.a(this.j);
        addView(this.b, 0, a());
        com.amoad.ay ayVar = new com.amoad.ay(context);
        this.g = ayVar;
        ayVar.setOnClickListener(this.l);
        addView(this.g, c());
        this.h = new android.os.Handler(android.os.Looper.getMainLooper());
        d();
    }

    static /* synthetic */ void a(com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView) {
        for (com.amoad.bk bkVar : aMoAdNativeMainVideoView.f137a.H) {
            if (!bkVar.c) {
                long jH = aMoAdNativeMainVideoView.b.h();
                if (jH >= bkVar.b) {
                    com.amoad.l.a(aMoAdNativeMainVideoView.getContext(), bkVar, com.amoad.l.a(aMoAdNativeMainVideoView.b), aMoAdNativeMainVideoView.b.f174a.f(), jH);
                }
            }
        }
    }

    private android.widget.RelativeLayout.LayoutParams b() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(a(30), a(22));
        layoutParams.addRule((this.c && this.f137a.I.b == com.amoad.AMoAdPlacement.BOTTOM_RIGHT) ? 10 : 12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, a(5), a(5));
        return layoutParams;
    }

    private android.widget.TextView b(android.content.Context context) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(16.0f);
        textView.setGravity(17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(a(5));
        gradientDrawable.setColor(android.graphics.Color.argb(org.objectweb.asm.Opcodes.GETSTATIC, 51, 51, 51));
        textView.setTextColor(-1);
        textView.setBackgroundDrawable(gradientDrawable);
        return textView;
    }

    static /* synthetic */ void b(com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView) {
        com.amoad.NativeVideoView nativeVideoView = aMoAdNativeMainVideoView.b;
        long jF = nativeVideoView.f174a.f() - nativeVideoView.f174a.e();
        long j = 0;
        if (jF >= 0 || nativeVideoView.h) {
            j = jF / 1000;
        } else {
            nativeVideoView.f174a.b();
            nativeVideoView.f174a.d();
        }
        aMoAdNativeMainVideoView.f.setText(java.lang.String.format(com.google.android.material.timepicker.TimeModel.NUMBER_FORMAT, java.lang.Long.valueOf(j + 1)));
    }

    private android.widget.RelativeLayout.LayoutParams c() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (this.c && this.f137a.I.b == com.amoad.AMoAdPlacement.TOP_LEFT) {
            layoutParams.addRule(11);
        }
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        com.amoad.NativeVideoView nativeVideoView = this.b;
        nativeVideoView.setVisibility(nativeVideoView.f174a.f238a != null ? 0 : 4);
        boolean z = true;
        this.f.setVisibility(this.c && this.b.i == com.amoad.NativeVideoView.State.Playing ? 0 : 4);
        if (this.b.f174a.f238a != null && this.b.i != com.amoad.NativeVideoView.State.PlaybackCompleted) {
            z = false;
        }
        if (this.b.i == com.amoad.NativeVideoView.State.PlaybackCompleted) {
            this.d.setLayoutParams(a());
        }
        this.d.setVisibility(z ? 0 : 4);
        this.g.setVisibility(this.b.f174a.f238a != null ? this.d.getVisibility() : 4);
    }

    static /* synthetic */ void d(com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView) {
        final com.amoad.AMoAdNativeMainVideoView.Listener listener = aMoAdNativeMainVideoView.i;
        aMoAdNativeMainVideoView.h.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdNativeMainVideoView.3
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdNativeMainVideoView.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onStart(com.amoad.AMoAdNativeMainVideoView.this);
                }
            }
        });
    }

    static /* synthetic */ void e(com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView) {
        final com.amoad.AMoAdNativeMainVideoView.Listener listener = aMoAdNativeMainVideoView.i;
        aMoAdNativeMainVideoView.h.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdNativeMainVideoView.4
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdNativeMainVideoView.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onComplete(com.amoad.AMoAdNativeMainVideoView.this);
                }
            }
        });
    }

    static /* synthetic */ void f(com.amoad.AMoAdNativeMainVideoView aMoAdNativeMainVideoView) {
        final com.amoad.AMoAdNativeMainVideoView.Listener listener = aMoAdNativeMainVideoView.i;
        aMoAdNativeMainVideoView.h.post(new java.lang.Runnable() { // from class: com.amoad.AMoAdNativeMainVideoView.5
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.AMoAdNativeMainVideoView.Listener listener2 = listener;
                if (listener2 != null) {
                    listener2.onFailed(com.amoad.AMoAdNativeMainVideoView.this);
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a(this.k);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.b(this.k);
    }

    void setImage(com.amoad.d dVar) {
        this.d.setImage(dVar);
    }

    public void setListener(com.amoad.AMoAdNativeMainVideoView.Listener listener) {
        this.i = listener;
    }

    void setMediaPlayer(android.media.MediaPlayer mediaPlayer) {
        this.b.a(mediaPlayer);
        d();
    }

    void setNativeInfo(com.amoad.i iVar) {
        this.f137a = iVar;
        com.amoad.NativeVideoView nativeVideoView = this.b;
        nativeVideoView.f174a.a(iVar.x, iVar.y);
        com.amoad.NativeVideoView nativeVideoView2 = this.b;
        float f = iVar.B;
        com.amoad.ar arVar = nativeVideoView2.f174a;
        arVar.b = f;
        arVar.c();
        com.amoad.NativeVideoView nativeVideoView3 = this.b;
        nativeVideoView3.b.a(iVar.A);
        com.amoad.NativeVideoView nativeVideoView4 = this.b;
        boolean z = iVar.C;
        float f2 = iVar.D;
        float f3 = iVar.E;
        nativeVideoView4.f = z;
        nativeVideoView4.d = f2;
        nativeVideoView4.e = f3;
        nativeVideoView4.e();
        this.b.c = iVar.I;
        this.d.setLayoutParams(a());
        this.f.setLayoutParams(b());
        this.g.setLayoutParams(c());
        this.g.a(iVar.I.c.mSize * 2, iVar.I.c.mSize * 2);
    }
}
