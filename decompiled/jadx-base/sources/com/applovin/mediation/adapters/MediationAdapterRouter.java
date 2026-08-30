package com.applovin.mediation.adapters;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MediationAdapterRouter {
    private static final java.util.Map<java.lang.String, com.applovin.mediation.adapters.MediationAdapterRouter> sharedInstances = new java.util.HashMap();
    private static final java.lang.Object sharedInstancesLock = new java.lang.Object();
    private final java.util.Map<java.lang.String, java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper>> listeners;
    private final java.lang.Object listenersLock;
    private final java.util.Set<com.applovin.mediation.adapter.MaxAdapter> loadedAdapters;
    protected com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener mOnCompletionListener;
    private com.applovin.impl.sdk.j mSdk;
    private final java.lang.String mTag;
    private final java.util.Set<com.applovin.mediation.adapter.MaxAdapter> showingAdapters;

    private final class MediationAdapterRouterListenerWrapper {
        private android.view.View mAdView;
        private final com.applovin.mediation.adapter.MaxAdapter mAdapter;
        private final com.applovin.mediation.adapter.listeners.MaxAdapterListener mListener;
        private final com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType mLoadType;

        MediationAdapterRouterListenerWrapper(com.applovin.mediation.adapter.MaxAdapter maxAdapter, com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener, com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType routerAdLoadType, android.view.View view) {
            this.mAdapter = maxAdapter;
            this.mListener = maxAdapterListener;
            this.mLoadType = routerAdLoadType;
            this.mAdView = view;
        }

        android.view.View getAdView() {
            return this.mAdView;
        }

        com.applovin.mediation.adapter.MaxAdapter getAdapter() {
            return this.mAdapter;
        }

        com.applovin.mediation.adapter.listeners.MaxAdapterListener getListener() {
            return this.mListener;
        }

        com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType getLoadType() {
            return this.mLoadType;
        }

        void setAdView(android.view.View view) {
            this.mAdView = view;
        }
    }

    private enum RouterAdLoadType {
        INTERSTITIAL,
        APPOPEN,
        REWARDED,
        ADVIEW
    }

    protected MediationAdapterRouter() {
        java.lang.String simpleName = getClass().getSimpleName();
        this.mTag = simpleName;
        this.listeners = new java.util.HashMap();
        this.listenersLock = new java.lang.Object();
        this.loadedAdapters = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.showingAdapters = java.util.Collections.synchronizedSet(new java.util.HashSet());
        if (com.applovin.sdk.AppLovinMediationProvider.MAX.equalsIgnoreCase(com.applovin.impl.sdk.j.u0.N())) {
            this.mSdk = com.applovin.impl.sdk.j.u0;
        } else {
            com.applovin.impl.sdk.n.h(simpleName, "Invalid mediation provider detected. Please set AppLovin SDK mediation provider to MAX via AppLovinSdk.getInstance(context).setMediationProvider( AppLovinMediationProvider.MAX )");
        }
    }

    private void addAdapter(com.applovin.mediation.adapter.MaxAdapter maxAdapter, com.applovin.mediation.adapter.listeners.MaxAdapterListener maxAdapterListener, java.lang.String str, com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType routerAdLoadType, android.view.View view) {
        synchronized (this.listenersLock) {
            com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper = new com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper(maxAdapter, maxAdapterListener, routerAdLoadType, view);
            java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> arrayList = this.listeners.get(str) != null ? this.listeners.get(str) : new java.util.ArrayList<>(1);
            arrayList.add(mediationAdapterRouterListenerWrapper);
            this.listeners.put(str, arrayList);
        }
    }

    private java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> getListenerWrappers(java.lang.String str) {
        if (this.listeners.containsKey(str)) {
            return new java.util.ArrayList(this.listeners.get(str));
        }
        return null;
    }

    private java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> getLoadingListenerWrappers(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.listenersLock) {
            java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers == null || listenerWrappers.size() <= 0) {
                return null;
            }
            for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
                if (!isAdLoaded(mediationAdapterRouterListenerWrapper.getAdapter())) {
                    arrayList.add(mediationAdapterRouterListenerWrapper);
                }
            }
            return arrayList;
        }
    }

    static com.applovin.mediation.adapters.MediationAdapterRouter getSharedInstance(java.lang.Class cls) {
        com.applovin.mediation.adapters.MediationAdapterRouter mediationAdapterRouter;
        synchronized (sharedInstancesLock) {
            java.lang.String name = cls.getName();
            mediationAdapterRouter = sharedInstances.get(name);
            if (mediationAdapterRouter == null) {
                try {
                    java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(new java.lang.Class[0]);
                    declaredConstructor.setAccessible(true);
                    mediationAdapterRouter = (com.applovin.mediation.adapters.MediationAdapterRouter) declaredConstructor.newInstance(new java.lang.Object[0]);
                } catch (java.lang.Throwable unused) {
                }
                sharedInstances.put(name, mediationAdapterRouter);
            }
        }
        return mediationAdapterRouter;
    }

    private java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> getShowingListenerWrappers(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.listenersLock) {
            java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers == null || listenerWrappers.size() <= 0) {
                return null;
            }
            for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
                if (isAdShowing(mediationAdapterRouterListenerWrapper.getAdapter())) {
                    arrayList.add(mediationAdapterRouterListenerWrapper);
                }
            }
            return arrayList;
        }
    }

    private boolean isAdLoaded(com.applovin.mediation.adapter.MaxAdapter maxAdapter) {
        return this.loadedAdapters.contains(maxAdapter);
    }

    private boolean isAdShowing(com.applovin.mediation.adapter.MaxAdapter maxAdapter) {
        return this.showingAdapters.contains(maxAdapter);
    }

    public void addAdViewAdapter(com.applovin.mediation.adapter.MaxAdapter maxAdapter, com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener maxAdViewAdapterListener, java.lang.String str, android.view.View view) {
        addAdapter(maxAdapter, maxAdViewAdapterListener, str, com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.ADVIEW, view);
    }

    public void addAppOpenAdapter(com.applovin.mediation.adapter.MaxAdapter maxAdapter, com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener maxAppOpenAdapterListener, java.lang.String str) {
        addAdapter(maxAdapter, maxAppOpenAdapterListener, str, com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.APPOPEN, null);
    }

    public void addInterstitialAdapter(com.applovin.mediation.adapter.MaxAdapter maxAdapter, com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener maxInterstitialAdapterListener, java.lang.String str) {
        addAdapter(maxAdapter, maxInterstitialAdapterListener, str, com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.INTERSTITIAL, null);
    }

    public void addRewardedAdapter(com.applovin.mediation.adapter.MaxAdapter maxAdapter, com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener maxRewardedAdapterListener, java.lang.String str) {
        addAdapter(maxAdapter, maxRewardedAdapterListener, str, com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.REWARDED, null);
    }

    public void addShowingAdapter(com.applovin.mediation.adapter.MaxAdapter maxAdapter) {
        this.showingAdapters.add(maxAdapter);
    }

    protected com.applovin.mediation.MaxReward getReward(java.lang.String str) {
        synchronized (this.listenersLock) {
            java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers != null && listenerWrappers.size() > 0) {
                com.applovin.mediation.adapter.MaxAdapter adapter = listenerWrappers.get(0).getAdapter();
                if (adapter instanceof com.applovin.mediation.adapters.MediationAdapterBase) {
                    return ((com.applovin.mediation.adapters.MediationAdapterBase) adapter).getReward();
                }
            }
            return com.applovin.impl.mediation.MaxRewardImpl.createDefault();
        }
    }

    abstract void initialize(com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters maxAdapterInitializationParameters, android.app.Activity activity, com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener onCompletionListener);

    protected void log(java.lang.String str) {
        com.applovin.impl.sdk.j jVar = this.mSdk;
        if (jVar != null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.mSdk.I().d(this.mTag, str);
            }
        }
    }

    protected void onAdClicked(java.lang.String str) {
        java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            com.applovin.mediation.adapter.listeners.MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial clicked");
                ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) listener).onInterstitialAdClicked();
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.APPOPEN) {
                log("App open clicked");
                ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) listener).onAppOpenAdClicked();
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.REWARDED) {
                log("Rewarded clicked");
                ((com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener) listener).onRewardedAdClicked();
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.ADVIEW) {
                log("AdView clicked");
                ((com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener) listener).onAdViewAdClicked();
            }
        }
    }

    protected void onAdDisplayFailed(java.lang.String str, com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
        java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            com.applovin.mediation.adapter.listeners.MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial failed to display with error: " + maxAdapterError.toString());
                ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayFailed(maxAdapterError);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.APPOPEN) {
                log("App open failed to display with error: " + maxAdapterError.toString());
                ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayFailed(maxAdapterError);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.REWARDED) {
                log("Rewarded failed to display with error: " + maxAdapterError.toString());
                ((com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener) listener).onRewardedAdDisplayFailed(maxAdapterError);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.ADVIEW) {
                log("AdView failed to display with error: " + maxAdapterError.toString());
                ((com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener) listener).onAdViewAdDisplayFailed(maxAdapterError);
            }
        }
    }

    protected void onAdDisplayed(java.lang.String str) {
        onAdDisplayed(str, null);
    }

    protected void onAdHidden(java.lang.String str) {
        java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            com.applovin.mediation.adapter.listeners.MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial hidden");
                ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) listener).onInterstitialAdHidden();
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.APPOPEN) {
                log("App open hidden");
                ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) listener).onAppOpenAdHidden();
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.REWARDED) {
                log("Rewarded hidden");
                ((com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener) listener).onRewardedAdHidden();
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.ADVIEW) {
                log("AdView hidden");
                ((com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener) listener).onAdViewAdHidden();
            }
        }
    }

    protected void onAdLoadFailed(java.lang.String str, com.applovin.mediation.adapter.MaxAdapterError maxAdapterError) {
        java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers == null || loadingListenerWrappers.size() <= 0) {
            return;
        }
        for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : loadingListenerWrappers) {
            com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            com.applovin.mediation.adapter.listeners.MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial failed to load with error: " + maxAdapterError.toString());
                ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) listener).onInterstitialAdLoadFailed(maxAdapterError);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.APPOPEN) {
                log("App open failed to load with error: " + maxAdapterError.toString());
                ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) listener).onAppOpenAdLoadFailed(maxAdapterError);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.REWARDED) {
                log("Rewarded failed to load with error: " + maxAdapterError.toString());
                ((com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener) listener).onRewardedAdLoadFailed(maxAdapterError);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.ADVIEW) {
                log("AdView failed to load with error: " + maxAdapterError.toString());
                ((com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener) listener).onAdViewAdLoadFailed(maxAdapterError);
            }
        }
    }

    protected void onAdLoaded(java.lang.String str) {
        onAdLoaded(str, null);
    }

    protected void onAdViewAdCollapsed(java.lang.String str) {
        java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            com.applovin.mediation.adapter.listeners.MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.ADVIEW) {
                log("AdView collapsed");
                ((com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener) listener).onAdViewAdCollapsed();
            }
        }
    }

    protected void onAdViewAdExpanded(java.lang.String str) {
        java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            com.applovin.mediation.adapter.listeners.MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.ADVIEW) {
                log("AdView expanded");
                ((com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener) listener).onAdViewAdExpanded();
            }
        }
    }

    protected void onUserRewarded(java.lang.String str, com.applovin.mediation.MaxReward maxReward) {
        java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            com.applovin.mediation.adapter.listeners.MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.REWARDED) {
                log("Rewarded user with reward: " + maxReward);
                ((com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener) listener).onUserRewarded(maxReward);
            }
        }
    }

    public void removeAdapter(com.applovin.mediation.adapter.MaxAdapter maxAdapter, java.lang.String str) {
        com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper next;
        this.loadedAdapters.remove(maxAdapter);
        this.showingAdapters.remove(maxAdapter);
        synchronized (this.listenersLock) {
            java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> list = this.listeners.get(str);
            if (list != null && list.size() > 0) {
                java.util.Iterator<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.getAdapter() != maxAdapter);
                if (next != null) {
                    list.remove(next);
                }
            }
        }
    }

    protected boolean shouldAlwaysRewardUser(java.lang.String str) {
        synchronized (this.listenersLock) {
            java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers != null && listenerWrappers.size() > 0) {
                com.applovin.mediation.adapter.MaxAdapter adapter = listenerWrappers.get(0).getAdapter();
                if (adapter instanceof com.applovin.mediation.adapters.MediationAdapterBase) {
                    return ((com.applovin.mediation.adapters.MediationAdapterBase) adapter).shouldAlwaysRewardUser();
                }
            }
            return false;
        }
    }

    public void updateAdView(android.view.View view, java.lang.String str) {
        synchronized (this.listenersLock) {
            java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> listenerWrappers = getListenerWrappers(str);
            if (listenerWrappers != null && listenerWrappers.size() > 0) {
                for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : listenerWrappers) {
                    if (mediationAdapterRouterListenerWrapper.getAdView() == null) {
                        mediationAdapterRouterListenerWrapper.setAdView(view);
                        break;
                    }
                }
            }
        }
    }

    protected void onAdDisplayed(java.lang.String str, android.os.Bundle bundle) {
        java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> showingListenerWrappers = getShowingListenerWrappers(str);
        if (showingListenerWrappers == null || showingListenerWrappers.size() <= 0) {
            return;
        }
        for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : showingListenerWrappers) {
            com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            com.applovin.mediation.adapter.listeners.MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial shown");
                ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) listener).onInterstitialAdDisplayed(bundle);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.APPOPEN) {
                log("App open shown");
                ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) listener).onAppOpenAdDisplayed(bundle);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.REWARDED) {
                log("Rewarded shown");
                ((com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener) listener).onRewardedAdDisplayed(bundle);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.ADVIEW) {
                log("AdView shown");
                ((com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener) listener).onAdViewAdDisplayed(bundle);
            }
        }
    }

    protected void onAdLoaded(java.lang.String str, android.os.Bundle bundle) {
        java.util.List<com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper> loadingListenerWrappers = getLoadingListenerWrappers(str);
        if (loadingListenerWrappers == null || loadingListenerWrappers.size() <= 0) {
            return;
        }
        for (com.applovin.mediation.adapters.MediationAdapterRouter.MediationAdapterRouterListenerWrapper mediationAdapterRouterListenerWrapper : loadingListenerWrappers) {
            this.loadedAdapters.add(mediationAdapterRouterListenerWrapper.getAdapter());
            com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType loadType = mediationAdapterRouterListenerWrapper.getLoadType();
            com.applovin.mediation.adapter.listeners.MaxAdapterListener listener = mediationAdapterRouterListenerWrapper.getListener();
            if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.INTERSTITIAL) {
                log("Interstitial loaded");
                ((com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener) listener).onInterstitialAdLoaded(bundle);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.APPOPEN) {
                log("App open loaded");
                ((com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener) listener).onAppOpenAdLoaded(bundle);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.REWARDED) {
                log("Rewarded loaded");
                ((com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener) listener).onRewardedAdLoaded(bundle);
            } else if (loadType == com.applovin.mediation.adapters.MediationAdapterRouter.RouterAdLoadType.ADVIEW) {
                log("AdView loaded");
                ((com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener) listener).onAdViewAdLoaded(mediationAdapterRouterListenerWrapper.getAdView(), bundle);
            }
        }
    }

    protected void log(java.lang.String str, java.lang.Throwable th) {
        com.applovin.impl.sdk.j jVar = this.mSdk;
        if (jVar != null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                this.mSdk.I().a(this.mTag, str, th);
            }
        }
    }
}
