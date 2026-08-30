package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class Cache {
    androidx.constraintlayout.core.Pools.Pool<androidx.constraintlayout.core.ArrayRow> optimizedArrayRowPool = new androidx.constraintlayout.core.Pools.SimplePool(256);
    androidx.constraintlayout.core.Pools.Pool<androidx.constraintlayout.core.ArrayRow> arrayRowPool = new androidx.constraintlayout.core.Pools.SimplePool(256);
    androidx.constraintlayout.core.Pools.Pool<androidx.constraintlayout.core.SolverVariable> solverVariablePool = new androidx.constraintlayout.core.Pools.SimplePool(256);
    androidx.constraintlayout.core.SolverVariable[] mIndexedVariables = new androidx.constraintlayout.core.SolverVariable[32];
}
