package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class AdItem implements android.os.Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final android.os.Parcelable.Creator<com.amoad.AdItem> f162a = new android.os.Parcelable.Creator<com.amoad.AdItem>() { // from class: com.amoad.AdItem.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ com.amoad.AdItem createFromParcel(android.os.Parcel parcel) {
            return new com.amoad.AdItem(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ com.amoad.AdItem[] newArray(int i) {
            return new com.amoad.AdItem[i];
        }
    };
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final java.lang.String g;
    private final java.util.List<java.lang.String> h;
    private final int i;
    private final java.lang.String j;
    private final java.lang.String k;
    private final boolean l;
    private final java.lang.String m;
    private boolean n;
    private boolean o;

    static class a extends android.view.View {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.amoad.g.a f163a;
        private final com.amoad.AdItem b;

        a(android.content.Context context, com.amoad.AdItem adItem) {
            super(context);
            this.b = adItem;
            setTag(com.amoad.AdItem.a.class.getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(android.view.View view) {
            com.amoad.g.a aVar = this.f163a;
            if (aVar != null) {
                com.amoad.g.a(view).b(aVar);
                this.f163a = null;
            }
        }

        @Override // android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (getParent() instanceof android.view.View) {
                android.view.View view = (android.view.View) getParent();
                this.f163a = new com.amoad.g.a() { // from class: com.amoad.AdItem.a.1
                    private int b = 0;

                    @Override // com.amoad.g.a
                    public final void a(android.view.View view2, float f) {
                        if (com.amoad.AdItem.a.this.b.o) {
                            com.amoad.AdItem.a.this.a(view2);
                            return;
                        }
                        if (!view2.isShown() || f < 0.5d) {
                            this.b = 0;
                            return;
                        }
                        int i = this.b;
                        this.b = i + 1;
                        if (((long) i) * com.amoad.g.f306a >= com.amoad.g.b) {
                            com.amoad.AdItem.a.this.b.b(com.amoad.AdItem.a.this.getContext());
                            com.amoad.AdItem.a.this.a(view2);
                        }
                    }
                };
                com.amoad.g.a(view).a(this.f163a);
            }
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (getParent() instanceof android.view.View) {
                a((android.view.View) getParent());
            }
        }
    }

    private AdItem(android.os.Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.createStringArrayList();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readByte() != 0;
        this.m = parcel.readString();
        this.n = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
    }

    /* synthetic */ AdItem(android.os.Parcel parcel, byte b) {
        this(parcel);
    }

    AdItem(com.amoad.al.a aVar) {
        this.b = aVar.d;
        this.c = aVar.e;
        this.d = aVar.f;
        this.e = aVar.g;
        this.f = aVar.h;
        this.g = aVar.j;
        this.h = aVar.q;
        this.i = aVar.f211a;
        this.j = aVar.o;
        this.k = aVar.p;
        this.m = aVar.b;
        this.l = aVar.n;
    }

    static void a(android.content.Context context, android.view.ViewGroup viewGroup, com.amoad.AdItem adItem) {
        viewGroup.addView(new com.amoad.AdItem.a(context, adItem));
    }

    private static void a(android.content.Context context, java.lang.String str) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            com.amoad.AMoAdLogger.getInstance().e(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    private void a(android.content.Context context, java.lang.String[] strArr, com.amoad.AdClickListener adClickListener) {
        java.lang.String string;
        java.util.List<java.lang.String> list = this.h;
        if (list == null) {
            if (a()) {
                com.amoad.l.e(context, this.g);
                string = android.net.Uri.parse("market://details?id=" + this.m).toString();
            }
            if (strArr == null && adClickListener != null) {
                java.lang.String scheme = android.net.Uri.parse(string).getScheme();
                for (java.lang.String str : strArr) {
                    if (scheme != null && scheme.equals(str)) {
                        adClickListener.onClick(string);
                        return;
                    }
                }
            } else if (adClickListener != null) {
                adClickListener.onClick(string);
                return;
            }
            a(context, string);
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            com.amoad.l.e(context, it.next());
        }
        string = this.g;
        if (strArr == null) {
            if (adClickListener != null) {
                adClickListener.onClick(string);
                return;
            }
        } else if (adClickListener != null) {
            adClickListener.onClick(string);
            return;
        }
        a(context, string);
    }

    static void a(android.view.ViewGroup viewGroup) {
        viewGroup.removeView(viewGroup.findViewWithTag(com.amoad.AdItem.a.class.getName()));
    }

    private boolean a() {
        return this.l && !android.text.TextUtils.isEmpty(this.m);
    }

    @java.lang.Deprecated
    final synchronized void a(android.content.Context context) {
        if (!this.n) {
            this.n = true;
            com.amoad.l.a(context, this.j);
        }
    }

    final synchronized void b(android.content.Context context) {
        if (!this.o) {
            this.o = true;
            com.amoad.l.b(context, this.k);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String getIconUrl() {
        return this.b;
    }

    public final java.lang.String getImageUrl() {
        return this.c;
    }

    public final java.lang.String getLink() {
        return this.g;
    }

    public final java.lang.String getServiceName() {
        return this.f;
    }

    public final java.lang.String getTitleLong() {
        return this.e;
    }

    public final java.lang.String getTitleShort() {
        return this.d;
    }

    public final int getUnitNo() {
        return this.i;
    }

    public final void onClick(android.content.Context context) {
        a(context, (java.lang.String[]) null, (com.amoad.AdClickListener) null);
    }

    public final void onClickWithCustomSchemes(android.content.Context context, java.lang.String[] strArr, com.amoad.AdClickListener adClickListener) {
        a(context, strArr, adClickListener);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeStringList(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.m);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
    }
}
