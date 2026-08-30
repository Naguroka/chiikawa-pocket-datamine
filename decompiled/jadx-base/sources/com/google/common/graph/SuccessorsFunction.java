package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Implement with a lambda, or use GraphBuilder to build a Graph with the desired edges")
@com.google.common.graph.ElementTypesAreNonnullByDefault
public interface SuccessorsFunction<N> {
    java.lang.Iterable<? extends N> successors(N node);
}
