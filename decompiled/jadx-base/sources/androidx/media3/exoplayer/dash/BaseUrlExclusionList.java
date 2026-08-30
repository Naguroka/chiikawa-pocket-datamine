package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public final class BaseUrlExclusionList {
    private final java.util.Map<java.lang.Integer, java.lang.Long> excludedPriorities;
    private final java.util.Map<java.lang.String, java.lang.Long> excludedServiceLocations;
    private final java.util.Random random;
    private final java.util.Map<java.util.List<android.util.Pair<java.lang.String, java.lang.Integer>>, androidx.media3.exoplayer.dash.manifest.BaseUrl> selectionsTaken;

    public BaseUrlExclusionList() {
        this(new java.util.Random());
    }

    BaseUrlExclusionList(java.util.Random random) {
        this.selectionsTaken = new java.util.HashMap();
        this.random = random;
        this.excludedServiceLocations = new java.util.HashMap();
        this.excludedPriorities = new java.util.HashMap();
    }

    public void exclude(androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl, long j) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + j;
        addExclusion(baseUrl.serviceLocation, jElapsedRealtime, this.excludedServiceLocations);
        if (baseUrl.priority != Integer.MIN_VALUE) {
            addExclusion(java.lang.Integer.valueOf(baseUrl.priority), jElapsedRealtime, this.excludedPriorities);
        }
    }

    public androidx.media3.exoplayer.dash.manifest.BaseUrl selectBaseUrl(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> listApplyExclusions = applyExclusions(list);
        if (listApplyExclusions.size() < 2) {
            return (androidx.media3.exoplayer.dash.manifest.BaseUrl) com.google.common.collect.Iterables.getFirst(listApplyExclusions, null);
        }
        java.util.Collections.sort(listApplyExclusions, new java.util.Comparator() { // from class: androidx.media3.exoplayer.dash.BaseUrlExclusionList$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.media3.exoplayer.dash.BaseUrlExclusionList.compareBaseUrl((androidx.media3.exoplayer.dash.manifest.BaseUrl) obj, (androidx.media3.exoplayer.dash.manifest.BaseUrl) obj2);
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = listApplyExclusions.get(0).priority;
        for (int i2 = 0; i2 < listApplyExclusions.size(); i2++) {
            androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl = listApplyExclusions.get(i2);
            if (i != baseUrl.priority) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listApplyExclusions.get(0);
            }
            arrayList.add(new android.util.Pair(baseUrl.serviceLocation, java.lang.Integer.valueOf(baseUrl.weight)));
        }
        androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl2 = this.selectionsTaken.get(arrayList);
        if (baseUrl2 != null) {
            return baseUrl2;
        }
        androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrlSelectWeighted = selectWeighted(listApplyExclusions.subList(0, arrayList.size()));
        this.selectionsTaken.put(arrayList, baseUrlSelectWeighted);
        return baseUrlSelectWeighted;
    }

    public int getPriorityCountAfterExclusion(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> listApplyExclusions = applyExclusions(list);
        for (int i = 0; i < listApplyExclusions.size(); i++) {
            hashSet.add(java.lang.Integer.valueOf(listApplyExclusions.get(i).priority));
        }
        return hashSet.size();
    }

    public static int getPriorityCount(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(java.lang.Integer.valueOf(list.get(i).priority));
        }
        return hashSet.size();
    }

    public void reset() {
        this.excludedServiceLocations.clear();
        this.excludedPriorities.clear();
        this.selectionsTaken.clear();
    }

    private java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> applyExclusions(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        removeExpiredExclusions(jElapsedRealtime, this.excludedServiceLocations);
        removeExpiredExclusions(jElapsedRealtime, this.excludedPriorities);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl = list.get(i);
            if (!this.excludedServiceLocations.containsKey(baseUrl.serviceLocation) && !this.excludedPriorities.containsKey(java.lang.Integer.valueOf(baseUrl.priority))) {
                arrayList.add(baseUrl);
            }
        }
        return arrayList;
    }

    private androidx.media3.exoplayer.dash.manifest.BaseUrl selectWeighted(java.util.List<androidx.media3.exoplayer.dash.manifest.BaseUrl> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += list.get(i2).weight;
        }
        int iNextInt = this.random.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl = list.get(i4);
            i3 += baseUrl.weight;
            if (iNextInt < i3) {
                return baseUrl;
            }
        }
        return (androidx.media3.exoplayer.dash.manifest.BaseUrl) com.google.common.collect.Iterables.getLast(list);
    }

    private static <T> void addExclusion(T t, long j, java.util.Map<T, java.lang.Long> map) {
        if (map.containsKey(t)) {
            j = java.lang.Math.max(j, ((java.lang.Long) androidx.media3.common.util.Util.castNonNull(map.get(t))).longValue());
        }
        map.put(t, java.lang.Long.valueOf(j));
    }

    private static <T> void removeExpiredExclusions(long j, java.util.Map<T, java.lang.Long> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<T, java.lang.Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareBaseUrl(androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl, androidx.media3.exoplayer.dash.manifest.BaseUrl baseUrl2) {
        int iCompare = java.lang.Integer.compare(baseUrl.priority, baseUrl2.priority);
        return iCompare != 0 ? iCompare : baseUrl.serviceLocation.compareTo(baseUrl2.serviceLocation);
    }
}
