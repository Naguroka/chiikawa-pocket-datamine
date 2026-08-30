package com.google.android.gms.drive.widget;

/* JADX INFO: loaded from: classes4.dex */
public class DataBufferAdapter<T> extends android.widget.BaseAdapter {
    private static final com.google.android.gms.common.internal.GmsLogger zzbz = new com.google.android.gms.common.internal.GmsLogger("DataBufferAdapter", "");
    private final int fieldId;
    private final int resource;
    private final android.content.Context zzgw;
    private int zzmz;
    private final java.util.List<com.google.android.gms.common.data.DataBuffer<T>> zzna;
    private final android.view.LayoutInflater zznb;
    private boolean zznc;

    public DataBufferAdapter(android.content.Context context, int i, int i2, java.util.List<com.google.android.gms.common.data.DataBuffer<T>> list) {
        this.zznc = true;
        this.zzgw = context;
        this.zzmz = i;
        this.resource = i;
        this.fieldId = i2;
        this.zzna = list;
        this.zznb = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public DataBufferAdapter(android.content.Context context, int i, int i2) {
        this(context, i, i2, new java.util.ArrayList());
    }

    public DataBufferAdapter(android.content.Context context, int i, java.util.List<com.google.android.gms.common.data.DataBuffer<T>> list) {
        this(context, i, 0, list);
    }

    public DataBufferAdapter(android.content.Context context, int i) {
        this(context, i, 0, new java.util.ArrayList());
    }

    public DataBufferAdapter(android.content.Context context, int i, int i2, com.google.android.gms.common.data.DataBuffer<T>... dataBufferArr) {
        this(context, i, i2, java.util.Arrays.asList(dataBufferArr));
    }

    public DataBufferAdapter(android.content.Context context, int i, com.google.android.gms.common.data.DataBuffer<T>... dataBufferArr) {
        this(context, i, 0, java.util.Arrays.asList(dataBufferArr));
    }

    public void append(com.google.android.gms.common.data.DataBuffer<T> dataBuffer) {
        this.zzna.add(dataBuffer);
        if (this.zznc) {
            notifyDataSetChanged();
        }
    }

    public void clear() {
        java.util.Iterator<com.google.android.gms.common.data.DataBuffer<T>> it = this.zzna.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.zzna.clear();
        if (this.zznc) {
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.zznc = true;
    }

    public void setNotifyOnChange(boolean z) {
        this.zznc = z;
    }

    public android.content.Context getContext() {
        return this.zzgw;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.Iterator<com.google.android.gms.common.data.DataBuffer<T>> it = this.zzna.iterator();
        int count = 0;
        while (it.hasNext()) {
            count += it.next().getCount();
        }
        return count;
    }

    @Override // android.widget.Adapter
    public T getItem(int i) throws android.database.CursorIndexOutOfBoundsException {
        int i2 = i;
        for (com.google.android.gms.common.data.DataBuffer<T> dataBuffer : this.zzna) {
            int count = dataBuffer.getCount();
            if (count > i2) {
                try {
                    return dataBuffer.get(i2);
                } catch (android.database.CursorIndexOutOfBoundsException unused) {
                    throw new android.database.CursorIndexOutOfBoundsException(i, getCount());
                }
            }
            i2 -= count;
        }
        throw new android.database.CursorIndexOutOfBoundsException(i, getCount());
    }

    private final android.view.View zza(int i, android.view.View view, android.view.ViewGroup viewGroup, int i2) {
        android.widget.TextView textView;
        if (view == null) {
            view = this.zznb.inflate(i2, viewGroup, false);
        }
        try {
            int i3 = this.fieldId;
            if (i3 == 0) {
                textView = (android.widget.TextView) view;
            } else {
                textView = (android.widget.TextView) view.findViewById(i3);
            }
            T item = getItem(i);
            if (item instanceof java.lang.CharSequence) {
                textView.setText((java.lang.CharSequence) item);
            } else {
                textView.setText(item.toString());
            }
            return view;
        } catch (java.lang.ClassCastException e) {
            zzbz.e("DataBufferAdapter", "You must supply a resource ID for a TextView", e);
            throw new java.lang.IllegalStateException("DataBufferAdapter requires the resource ID to be a TextView", e);
        }
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        return zza(i, view, viewGroup, this.resource);
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        return zza(i, view, viewGroup, this.zzmz);
    }

    public void setDropDownViewResource(int i) {
        this.zzmz = i;
    }
}
