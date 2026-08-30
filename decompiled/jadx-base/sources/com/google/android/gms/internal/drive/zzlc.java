package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzlc extends com.google.android.gms.internal.drive.zzla {
    private static final java.lang.Class<?> zzto = java.util.Collections.unmodifiableList(java.util.Collections.emptyList()).getClass();

    private zzlc() {
        super();
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final void zza(java.lang.Object obj, long j) {
        java.lang.Object objUnmodifiableList;
        java.util.List list = (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(obj, j);
        if (list instanceof com.google.android.gms.internal.drive.zzkz) {
            objUnmodifiableList = ((com.google.android.gms.internal.drive.zzkz) list).zzds();
        } else {
            if (zzto.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.android.gms.internal.drive.zzmc) && (list instanceof com.google.android.gms.internal.drive.zzkp)) {
                com.google.android.gms.internal.drive.zzkp zzkpVar = (com.google.android.gms.internal.drive.zzkp) list;
                if (zzkpVar.zzbo()) {
                    zzkpVar.zzbp();
                    return;
                }
                return;
            }
            objUnmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.android.gms.internal.drive.zznd.zza(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.drive.zzla
    final <E> void zza(java.lang.Object obj, java.lang.Object obj2, long j) {
        java.util.List list;
        java.util.List list2;
        java.util.List listZzr;
        java.util.List listZzb = zzb(obj2, j);
        int size = listZzb.size();
        java.util.List listZzb2 = zzb(obj, j);
        if (listZzb2.isEmpty()) {
            if (listZzb2 instanceof com.google.android.gms.internal.drive.zzkz) {
                listZzr = new com.google.android.gms.internal.drive.zzky(size);
            } else if ((listZzb2 instanceof com.google.android.gms.internal.drive.zzmc) && (listZzb2 instanceof com.google.android.gms.internal.drive.zzkp)) {
                listZzr = ((com.google.android.gms.internal.drive.zzkp) listZzb2).zzr(size);
            } else {
                listZzr = new java.util.ArrayList(size);
            }
            com.google.android.gms.internal.drive.zznd.zza(obj, j, listZzr);
            list2 = listZzr;
        } else {
            if (zzto.isAssignableFrom(listZzb2.getClass())) {
                java.util.ArrayList arrayList = new java.util.ArrayList(listZzb2.size() + size);
                arrayList.addAll(listZzb2);
                com.google.android.gms.internal.drive.zznd.zza(obj, j, arrayList);
                list = arrayList;
            } else if (listZzb2 instanceof com.google.android.gms.internal.drive.zzna) {
                com.google.android.gms.internal.drive.zzky zzkyVar = new com.google.android.gms.internal.drive.zzky(listZzb2.size() + size);
                zzkyVar.addAll((com.google.android.gms.internal.drive.zzna) listZzb2);
                com.google.android.gms.internal.drive.zznd.zza(obj, j, zzkyVar);
                list = zzkyVar;
            } else if ((listZzb2 instanceof com.google.android.gms.internal.drive.zzmc) && (listZzb2 instanceof com.google.android.gms.internal.drive.zzkp)) {
                com.google.android.gms.internal.drive.zzkp zzkpVar = (com.google.android.gms.internal.drive.zzkp) listZzb2;
                if (!zzkpVar.zzbo()) {
                    list2 = listZzb2;
                    list2 = listZzb2;
                    list2 = listZzb2;
                    com.google.android.gms.internal.drive.zzkp<E> zzkpVarZzr = zzkpVar.zzr(listZzb2.size() + size);
                    com.google.android.gms.internal.drive.zznd.zza(obj, j, zzkpVarZzr);
                    list2 = zzkpVarZzr;
                }
            }
            list2 = list;
        }
        list2 = listZzb2;
        list2 = listZzb2;
        list2 = listZzb2;
        list2 = listZzb2;
        list2 = listZzb2;
        list2 = listZzb2;
        int size2 = list2.size();
        int size3 = listZzb.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(listZzb);
        }
        if (size2 > 0) {
            listZzb = list2;
        }
        com.google.android.gms.internal.drive.zznd.zza(obj, j, listZzb);
    }

    private static <E> java.util.List<E> zzb(java.lang.Object obj, long j) {
        return (java.util.List) com.google.android.gms.internal.drive.zznd.zzo(obj, j);
    }
}
