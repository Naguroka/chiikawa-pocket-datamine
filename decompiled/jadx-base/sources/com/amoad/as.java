package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class as extends android.widget.BaseAdapter {
    final java.lang.String b;
    final com.amoad.j c;
    private final android.content.Context e;
    private final android.widget.Adapter f;
    private final java.lang.String g;
    private final int h;
    private final android.view.LayoutInflater i;
    private int j;
    private int k;
    private com.amoad.AMoAdNativeViewCoder l;
    private com.amoad.AMoAdNativeListener m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.util.List<com.amoad.as.a> f242a = new java.util.ArrayList();
    boolean d = true;
    private android.database.DataSetObserver n = new android.database.DataSetObserver() { // from class: com.amoad.as.1
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            com.amoad.as.this.a();
            com.amoad.as.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            com.amoad.as.this.notifyDataSetInvalidated();
        }
    };

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.amoad.i f245a;

        a(com.amoad.i iVar) {
            this.f245a = iVar;
        }
    }

    as(android.content.Context context, java.lang.String str, java.lang.String str2, android.widget.Adapter adapter, int i, com.amoad.AMoAdNativeListener aMoAdNativeListener, com.amoad.AMoAdNativeViewCoder aMoAdNativeViewCoder) {
        if (adapter == null) {
            throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format("Adapterがnullです。（sid={0}, tag={1}）Adapter Classを実装したオブジェクトを引数に追加してください。", str, str2));
        }
        this.i = android.view.LayoutInflater.from(context);
        this.e = context.getApplicationContext();
        this.f = adapter;
        this.b = str;
        this.g = str2;
        com.amoad.j jVarA = com.amoad.j.a(context);
        this.c = jVarA;
        this.h = i;
        this.m = aMoAdNativeListener;
        this.l = aMoAdNativeViewCoder;
        a(com.amoad.j.a(jVarA.f311a).a(str).e, com.amoad.j.a(jVarA.f311a).a(str).f);
        a();
    }

    private static int a(int i, int i2, int i3) {
        if (i2 == -9) {
            return i;
        }
        if (i3 == 0) {
            if (i < i2) {
                return i;
            }
            if (i > i2) {
                return i - 1;
            }
            return -1;
        }
        if (i < i2) {
            return i;
        }
        int i4 = i - i2;
        int i5 = i4 / i3;
        if (i4 % i3 == 0) {
            return -1;
        }
        return (i - i5) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int iC = c(this.f.getCount(), this.j, this.k) - this.f242a.size();
        if (iC > 0) {
            a(iC);
        } else if (iC < 0) {
            b(-iC);
        }
    }

    private void a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f242a.add(new com.amoad.as.a(null));
        }
    }

    private void b(int i) {
        if (i <= this.f242a.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                java.util.List<com.amoad.as.a> list = this.f242a;
                list.remove(list.size() - 1);
            }
        }
    }

    private static boolean b(int i, int i2, int i3) {
        return d(i, i2, i3) >= 0;
    }

    private static int c(int i, int i2, int i3) {
        if (i2 == -9) {
            return 0;
        }
        if (i3 == 0) {
            return i > i2 ? 1 : 0;
        }
        if (i < i2) {
            return 0;
        }
        int i4 = i - i2;
        int i5 = i3 - 1;
        int i6 = i4 / i5;
        return i4 % i5 > 0 ? i6 + 1 : i6;
    }

    private static int d(int i, int i2, int i3) {
        if (i2 == -9) {
            return -1;
        }
        if (i3 == 0) {
            return i == i2 ? 0 : -1;
        }
        if (i < i2) {
            return -1;
        }
        int i4 = i - i2;
        if (i4 % i3 == 0) {
            return i4 / i3;
        }
        return -1;
    }

    final void a(int i, int i2) {
        this.j = i;
        this.k = i2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return !this.d ? this.f.getCount() : this.f.getCount() + this.f242a.size();
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int i) {
        if (this.d) {
            if (b(i, this.j, this.k)) {
                return null;
            }
            i = a(i, this.j, this.k);
        }
        return this.f.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (this.d) {
            if (b(i, this.j, this.k)) {
                return -1L;
            }
            i = a(i, this.j, this.k);
        }
        return this.f.getItemId(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        if (this.d && b(i, this.j, this.k)) {
            return getViewTypeCount() - 1;
        }
        return this.f.getItemViewType(i);
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.d) {
            final int iD = d(i, this.j, this.k);
            if (iD >= 0) {
                com.amoad.as.a aVar = this.f242a.get(iD);
                if (view == null) {
                    view = this.i.inflate(this.h, (android.view.ViewGroup) null);
                }
                final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(view);
                if (aVar.f245a == null) {
                    this.c.a(this.b, new com.amoad.av() { // from class: com.amoad.as.2
                        @Override // com.amoad.av
                        public final void a(java.lang.String str, com.amoad.AMoAdNativeListener.Result result, com.amoad.i iVar) {
                            android.view.View view2 = (android.view.View) weakReference.get();
                            if (view2 == null) {
                                return;
                            }
                            if (com.amoad.as.this.m != null) {
                                com.amoad.as.this.m.onReceived(com.amoad.as.this.b, com.amoad.as.this.g, view2, result);
                            }
                            if (iVar != null) {
                                com.amoad.au.a(com.amoad.as.this.e, view2, iVar, com.amoad.as.this.g);
                                com.amoad.au.a(com.amoad.as.this.e, view2, iVar, com.amoad.as.this.b, com.amoad.as.this.g, (com.amoad.AMoAdNativeFailureListener) null, new com.amoad.ao(com.amoad.as.this.m), com.amoad.as.this.l);
                                com.amoad.as.this.f242a.set(iD, new com.amoad.as.a(iVar));
                            }
                        }
                    });
                } else {
                    com.amoad.au.a(this.e, view, aVar.f245a, this.g);
                    com.amoad.au.a(this.e, view, aVar.f245a, this.b, this.g, (com.amoad.AMoAdNativeFailureListener) null, new com.amoad.ao(this.m), this.l);
                }
                return view;
            }
            i = a(i, this.j, this.k);
        }
        return this.f.getView(i, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return !this.d ? this.f.getViewTypeCount() : this.f.getViewTypeCount() + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        this.f.registerDataSetObserver(this.n);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        super.unregisterDataSetObserver(dataSetObserver);
        this.f.unregisterDataSetObserver(this.n);
    }
}
