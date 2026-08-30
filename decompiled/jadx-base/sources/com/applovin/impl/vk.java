package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vk extends com.applovin.impl.sk {
    public static final android.os.Parcelable.Creator<com.applovin.impl.vk> CREATOR = new com.applovin.impl.vk.a();

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.vk[] newArray(int i) {
            return new com.applovin.impl.vk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.vk createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.vk();
        }
    }
}
