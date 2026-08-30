package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dc extends android.widget.BaseAdapter implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected android.content.Context f719a;
    private java.util.List b = new java.util.ArrayList();
    private java.util.Map c = new java.util.HashMap();
    private com.applovin.impl.dc.a d;

    public interface a {
        void a(com.applovin.impl.kb kbVar, com.applovin.impl.cc ccVar);
    }

    protected com.applovin.impl.cc a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract int b();

    protected abstract java.util.List c(int i);

    protected abstract int d(int i);

    protected abstract com.applovin.impl.cc e(int i);

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return com.applovin.impl.cc.n();
    }

    protected dc(android.content.Context context) {
        this.f719a = context.getApplicationContext();
    }

    public void c() {
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.dc$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyDataSetChanged();
            }
        });
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).o();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.applovin.impl.cc getItem(int i) {
        return (com.applovin.impl.cc) this.b.get(i);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i;
        this.b = new java.util.ArrayList();
        int iB = b();
        this.c = new java.util.HashMap(iB);
        com.applovin.impl.cc ccVarA = a();
        if (ccVarA != null) {
            this.b.add(ccVarA);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < iB; i2++) {
            int iD = d(i2);
            if (iD != 0) {
                this.b.add(e(i2));
                this.b.addAll(c(i2));
                this.c.put(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
                i += iD + 1;
            }
        }
        this.b.add(new com.applovin.impl.fj(""));
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        com.applovin.impl.bc bcVar;
        com.applovin.impl.cc item = getItem(i);
        if (view == null) {
            view = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            bcVar = new com.applovin.impl.bc();
            bcVar.f642a = (android.widget.TextView) view.findViewById(android.R.id.text1);
            bcVar.b = (android.widget.TextView) view.findViewById(android.R.id.text2);
            bcVar.c = (android.widget.ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            bcVar.d = (android.widget.ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(bcVar);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            bcVar = (com.applovin.impl.bc) view.getTag();
        }
        bcVar.a(i);
        bcVar.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.applovin.impl.bc bcVar = (com.applovin.impl.bc) view.getTag();
        com.applovin.impl.cc ccVarB = bcVar.b();
        com.applovin.impl.kb kbVarA = a(bcVar.a());
        com.applovin.impl.dc.a aVar = this.d;
        if (aVar == null || kbVarA == null) {
            return;
        }
        aVar.a(kbVarA, ccVarB);
    }

    private android.graphics.drawable.Drawable a(android.view.View view) {
        android.graphics.drawable.Drawable background = view.getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(com.applovin.impl.t3.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f719a));
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    private com.applovin.impl.kb a(int i) {
        for (int i2 = 0; i2 < b(); i2++) {
            java.lang.Integer num = (java.lang.Integer) this.c.get(java.lang.Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + d(i2)) {
                    return new com.applovin.impl.kb(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    public void a(com.applovin.impl.dc.a aVar) {
        this.d = aVar;
    }
}
