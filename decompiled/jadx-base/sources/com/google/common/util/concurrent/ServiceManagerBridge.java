package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
interface ServiceManagerBridge {
    com.google.common.collect.ImmutableMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState();
}
