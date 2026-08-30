package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    private static int POOL_SIZE = 1000;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static androidx.constraintlayout.core.Metrics sMetrics;
    final androidx.constraintlayout.core.Cache mCache;
    private androidx.constraintlayout.core.LinearSystem.Row mGoal;
    androidx.constraintlayout.core.ArrayRow[] mRows;
    private androidx.constraintlayout.core.LinearSystem.Row mTempGoal;
    public boolean hasSimpleDefinition = false;
    int mVariablesID = 0;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> mVariables = null;
    private int TABLE_SIZE = 32;
    private int mMaxColumns = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;
    private boolean[] mAlreadyTestedCandidates = new boolean[32];
    int mNumColumns = 1;
    int mNumRows = 0;
    private int mMaxRows = 32;
    private androidx.constraintlayout.core.SolverVariable[] mPoolVariables = new androidx.constraintlayout.core.SolverVariable[POOL_SIZE];
    private int mPoolVariablesCount = 0;

    interface Row {
        void addError(androidx.constraintlayout.core.SolverVariable solverVariable);

        void clear();

        androidx.constraintlayout.core.SolverVariable getKey();

        androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(androidx.constraintlayout.core.LinearSystem.Row row);

        boolean isEmpty();

        void updateFromFinalVariable(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.SolverVariable solverVariable, boolean z);

        void updateFromRow(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.ArrayRow arrayRow, boolean z);

        void updateFromSystem(androidx.constraintlayout.core.LinearSystem linearSystem);
    }

    private java.lang.String getDisplayStrength(int i) {
        if (i == 1) {
            return "LOW";
        }
        if (i == 2) {
            return "MEDIUM";
        }
        if (i == 3) {
            return "HIGH";
        }
        if (i == 4) {
            return "HIGHEST";
        }
        if (i == 5) {
            return "EQUALITY";
        }
        if (i == 8) {
            return "FIXED";
        }
        return i == 6 ? "BARRIER" : "NONE";
    }

    class ValuesRow extends androidx.constraintlayout.core.ArrayRow {
        public ValuesRow(androidx.constraintlayout.core.Cache cache) {
            this.variables = new androidx.constraintlayout.core.SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        this.mRows = null;
        this.mRows = new androidx.constraintlayout.core.ArrayRow[32];
        releaseRows();
        androidx.constraintlayout.core.Cache cache = new androidx.constraintlayout.core.Cache();
        this.mCache = cache;
        this.mGoal = new androidx.constraintlayout.core.PriorityGoalRow(cache);
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new androidx.constraintlayout.core.LinearSystem.ValuesRow(cache);
        } else {
            this.mTempGoal = new androidx.constraintlayout.core.ArrayRow(cache);
        }
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics metrics) {
        sMetrics = metrics;
    }

    public static androidx.constraintlayout.core.Metrics getMetrics() {
        return sMetrics;
    }

    private void increaseTableSize() {
        int i = this.TABLE_SIZE * 2;
        this.TABLE_SIZE = i;
        this.mRows = (androidx.constraintlayout.core.ArrayRow[]) java.util.Arrays.copyOf(this.mRows, i);
        androidx.constraintlayout.core.Cache cache = this.mCache;
        cache.mIndexedVariables = (androidx.constraintlayout.core.SolverVariable[]) java.util.Arrays.copyOf(cache.mIndexedVariables, this.TABLE_SIZE);
        int i2 = this.TABLE_SIZE;
        this.mAlreadyTestedCandidates = new boolean[i2];
        this.mMaxColumns = i2;
        this.mMaxRows = i2;
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
            metrics2.maxTableSize = java.lang.Math.max(metrics2.maxTableSize, this.TABLE_SIZE);
            androidx.constraintlayout.core.Metrics metrics3 = sMetrics;
            metrics3.lastTableSize = metrics3.maxTableSize;
        }
    }

    private void releaseRows() {
        int i = 0;
        if (OPTIMIZED_ENGINE) {
            while (i < this.mNumRows) {
                androidx.constraintlayout.core.ArrayRow arrayRow = this.mRows[i];
                if (arrayRow != null) {
                    this.mCache.optimizedArrayRowPool.release(arrayRow);
                }
                this.mRows[i] = null;
                i++;
            }
            return;
        }
        while (i < this.mNumRows) {
            androidx.constraintlayout.core.ArrayRow arrayRow2 = this.mRows[i];
            if (arrayRow2 != null) {
                this.mCache.arrayRowPool.release(arrayRow2);
            }
            this.mRows[i] = null;
            i++;
        }
    }

    public void reset() {
        for (int i = 0; i < this.mCache.mIndexedVariables.length; i++) {
            androidx.constraintlayout.core.SolverVariable solverVariable = this.mCache.mIndexedVariables[i];
            if (solverVariable != null) {
                solverVariable.reset();
            }
        }
        this.mCache.solverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        java.util.Arrays.fill(this.mCache.mIndexedVariables, (java.lang.Object) null);
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> map = this.mVariables;
        if (map != null) {
            map.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.mRows[i2];
            if (arrayRow != null) {
                arrayRow.used = false;
            }
        }
        releaseRows();
        this.mNumRows = 0;
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new androidx.constraintlayout.core.LinearSystem.ValuesRow(this.mCache);
        } else {
            this.mTempGoal = new androidx.constraintlayout.core.ArrayRow(this.mCache);
        }
    }

    public androidx.constraintlayout.core.SolverVariable createObjectVariable(java.lang.Object obj) {
        androidx.constraintlayout.core.SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        if (obj instanceof androidx.constraintlayout.core.widgets.ConstraintAnchor) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = (androidx.constraintlayout.core.widgets.ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(this.mCache);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            if (solverVariable.id == -1 || solverVariable.id > this.mVariablesID || this.mCache.mIndexedVariables[solverVariable.id] == null) {
                if (solverVariable.id != -1) {
                    solverVariable.reset();
                }
                int i = this.mVariablesID + 1;
                this.mVariablesID = i;
                this.mNumColumns++;
                solverVariable.id = i;
                solverVariable.mType = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED;
                this.mCache.mIndexedVariables[this.mVariablesID] = solverVariable;
            }
        }
        return solverVariable;
    }

    public androidx.constraintlayout.core.ArrayRow createRow() {
        androidx.constraintlayout.core.ArrayRow arrayRowAcquire;
        if (OPTIMIZED_ENGINE) {
            arrayRowAcquire = this.mCache.optimizedArrayRowPool.acquire();
            if (arrayRowAcquire == null) {
                arrayRowAcquire = new androidx.constraintlayout.core.LinearSystem.ValuesRow(this.mCache);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            } else {
                arrayRowAcquire.reset();
            }
        } else {
            arrayRowAcquire = this.mCache.arrayRowPool.acquire();
            if (arrayRowAcquire == null) {
                arrayRowAcquire = new androidx.constraintlayout.core.ArrayRow(this.mCache);
                ARRAY_ROW_CREATION++;
            } else {
                arrayRowAcquire.reset();
            }
        }
        androidx.constraintlayout.core.SolverVariable.increaseErrorId();
        return arrayRowAcquire;
    }

    public androidx.constraintlayout.core.SolverVariable createSlackVariable() {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        androidx.constraintlayout.core.SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(androidx.constraintlayout.core.SolverVariable.Type.SLACK, null);
        int i = this.mVariablesID + 1;
        this.mVariablesID = i;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.id = i;
        this.mCache.mIndexedVariables[this.mVariablesID] = solverVariableAcquireSolverVariable;
        return solverVariableAcquireSolverVariable;
    }

    public androidx.constraintlayout.core.SolverVariable createExtraVariable() {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        androidx.constraintlayout.core.SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(androidx.constraintlayout.core.SolverVariable.Type.SLACK, null);
        int i = this.mVariablesID + 1;
        this.mVariablesID = i;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.id = i;
        this.mCache.mIndexedVariables[this.mVariablesID] = solverVariableAcquireSolverVariable;
        return solverVariableAcquireSolverVariable;
    }

    private void addError(androidx.constraintlayout.core.ArrayRow arrayRow) {
        arrayRow.addError(this, 0);
    }

    private void addSingleError(androidx.constraintlayout.core.ArrayRow arrayRow, int i) {
        addSingleError(arrayRow, i, 0);
    }

    void addSingleError(androidx.constraintlayout.core.ArrayRow arrayRow, int i, int i2) {
        arrayRow.addSingleError(createErrorVariable(i2, null), i);
    }

    private androidx.constraintlayout.core.SolverVariable createVariable(java.lang.String str, androidx.constraintlayout.core.SolverVariable.Type type) {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.variables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        androidx.constraintlayout.core.SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(type, null);
        solverVariableAcquireSolverVariable.setName(str);
        int i = this.mVariablesID + 1;
        this.mVariablesID = i;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.id = i;
        if (this.mVariables == null) {
            this.mVariables = new java.util.HashMap<>();
        }
        this.mVariables.put(str, solverVariableAcquireSolverVariable);
        this.mCache.mIndexedVariables[this.mVariablesID] = solverVariableAcquireSolverVariable;
        return solverVariableAcquireSolverVariable;
    }

    public androidx.constraintlayout.core.SolverVariable createErrorVariable(int i, java.lang.String str) {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        androidx.constraintlayout.core.SolverVariable solverVariableAcquireSolverVariable = acquireSolverVariable(androidx.constraintlayout.core.SolverVariable.Type.ERROR, str);
        int i2 = this.mVariablesID + 1;
        this.mVariablesID = i2;
        this.mNumColumns++;
        solverVariableAcquireSolverVariable.id = i2;
        solverVariableAcquireSolverVariable.strength = i;
        this.mCache.mIndexedVariables[this.mVariablesID] = solverVariableAcquireSolverVariable;
        this.mGoal.addError(solverVariableAcquireSolverVariable);
        return solverVariableAcquireSolverVariable;
    }

    private androidx.constraintlayout.core.SolverVariable acquireSolverVariable(androidx.constraintlayout.core.SolverVariable.Type type, java.lang.String str) {
        androidx.constraintlayout.core.SolverVariable solverVariableAcquire = this.mCache.solverVariablePool.acquire();
        if (solverVariableAcquire == null) {
            solverVariableAcquire = new androidx.constraintlayout.core.SolverVariable(type, str);
            solverVariableAcquire.setType(type, str);
        } else {
            solverVariableAcquire.reset();
            solverVariableAcquire.setType(type, str);
        }
        int i = this.mPoolVariablesCount;
        int i2 = POOL_SIZE;
        if (i >= i2) {
            int i3 = i2 * 2;
            POOL_SIZE = i3;
            this.mPoolVariables = (androidx.constraintlayout.core.SolverVariable[]) java.util.Arrays.copyOf(this.mPoolVariables, i3);
        }
        androidx.constraintlayout.core.SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i4 = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i4 + 1;
        solverVariableArr[i4] = solverVariableAcquire;
        return solverVariableAcquire;
    }

    androidx.constraintlayout.core.LinearSystem.Row getGoal() {
        return this.mGoal;
    }

    androidx.constraintlayout.core.ArrayRow getRow(int i) {
        return this.mRows[i];
    }

    float getValueFor(java.lang.String str) {
        androidx.constraintlayout.core.SolverVariable variable = getVariable(str, androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED);
        if (variable == null) {
            return 0.0f;
        }
        return variable.computedValue;
    }

    public int getObjectVariableValue(java.lang.Object obj) {
        androidx.constraintlayout.core.SolverVariable solverVariable = ((androidx.constraintlayout.core.widgets.ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    androidx.constraintlayout.core.SolverVariable getVariable(java.lang.String str, androidx.constraintlayout.core.SolverVariable.Type type) {
        if (this.mVariables == null) {
            this.mVariables = new java.util.HashMap<>();
        }
        androidx.constraintlayout.core.SolverVariable solverVariable = this.mVariables.get(str);
        return solverVariable == null ? createVariable(str, type) : solverVariable;
    }

    public void minimize() throws java.lang.Exception {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        if (this.mGoal.isEmpty()) {
            computeValues();
            return;
        }
        if (this.graphOptimizer || this.newgraphOptimizer) {
            androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.graphOptimizer++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.mNumRows) {
                    z = true;
                    break;
                } else if (!this.mRows[i].isSimpleDefinition) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                minimizeGoal(this.mGoal);
                return;
            }
            androidx.constraintlayout.core.Metrics metrics3 = sMetrics;
            if (metrics3 != null) {
                metrics3.fullySolved++;
            }
            computeValues();
            return;
        }
        minimizeGoal(this.mGoal);
    }

    void minimizeGoal(androidx.constraintlayout.core.LinearSystem.Row row) throws java.lang.Exception {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimizeGoal++;
            androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
            metrics2.maxVariables = java.lang.Math.max(metrics2.maxVariables, this.mNumColumns);
            androidx.constraintlayout.core.Metrics metrics3 = sMetrics;
            metrics3.maxRows = java.lang.Math.max(metrics3.maxRows, this.mNumRows);
        }
        enforceBFS(row);
        optimize(row, false);
        computeValues();
    }

    final void cleanupRows() {
        int i;
        int i2 = 0;
        while (i2 < this.mNumRows) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.mRows[i2];
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.isSimpleDefinition = true;
            }
            if (arrayRow.isSimpleDefinition) {
                arrayRow.variable.computedValue = arrayRow.constantValue;
                arrayRow.variable.removeFromRow(arrayRow);
                int i3 = i2;
                while (true) {
                    i = this.mNumRows;
                    if (i3 >= i - 1) {
                        break;
                    }
                    androidx.constraintlayout.core.ArrayRow[] arrayRowArr = this.mRows;
                    int i4 = i3 + 1;
                    arrayRowArr[i3] = arrayRowArr[i4];
                    i3 = i4;
                }
                this.mRows[i - 1] = null;
                this.mNumRows = i - 1;
                i2--;
                if (OPTIMIZED_ENGINE) {
                    this.mCache.optimizedArrayRowPool.release(arrayRow);
                } else {
                    this.mCache.arrayRowPool.release(arrayRow);
                }
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    public void addConstraint(androidx.constraintlayout.core.ArrayRow arrayRow) {
        androidx.constraintlayout.core.SolverVariable solverVariablePickPivot;
        if (arrayRow == null) {
            return;
        }
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.constraints++;
            if (arrayRow.isSimpleDefinition) {
                sMetrics.simpleconstraints++;
            }
        }
        boolean z = true;
        if (this.mNumRows + 1 >= this.mMaxRows || this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        boolean z2 = false;
        if (!arrayRow.isSimpleDefinition) {
            arrayRow.updateFromSystem(this);
            if (arrayRow.isEmpty()) {
                return;
            }
            arrayRow.ensurePositiveConstant();
            if (arrayRow.chooseSubject(this)) {
                androidx.constraintlayout.core.SolverVariable solverVariableCreateExtraVariable = createExtraVariable();
                arrayRow.variable = solverVariableCreateExtraVariable;
                int i = this.mNumRows;
                addRow(arrayRow);
                if (this.mNumRows == i + 1) {
                    this.mTempGoal.initFromRow(arrayRow);
                    optimize(this.mTempGoal, true);
                    if (solverVariableCreateExtraVariable.definitionId == -1) {
                        if (arrayRow.variable == solverVariableCreateExtraVariable && (solverVariablePickPivot = arrayRow.pickPivot(solverVariableCreateExtraVariable)) != null) {
                            androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
                            if (metrics2 != null) {
                                metrics2.pivots++;
                            }
                            arrayRow.pivot(solverVariablePickPivot);
                        }
                        if (!arrayRow.isSimpleDefinition) {
                            arrayRow.variable.updateReferencesWithNewDefinition(this, arrayRow);
                        }
                        if (OPTIMIZED_ENGINE) {
                            this.mCache.optimizedArrayRowPool.release(arrayRow);
                        } else {
                            this.mCache.arrayRowPool.release(arrayRow);
                        }
                        this.mNumRows--;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!arrayRow.hasKeyVariable()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        addRow(arrayRow);
    }

    private final void addRow(androidx.constraintlayout.core.ArrayRow arrayRow) {
        int i;
        if (SIMPLIFY_SYNONYMS && arrayRow.isSimpleDefinition) {
            arrayRow.variable.setFinalValue(this, arrayRow.constantValue);
        } else {
            this.mRows[this.mNumRows] = arrayRow;
            arrayRow.variable.definitionId = this.mNumRows;
            this.mNumRows++;
            arrayRow.variable.updateReferencesWithNewDefinition(this, arrayRow);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i2 = 0;
            while (i2 < this.mNumRows) {
                if (this.mRows[i2] == null) {
                    java.lang.System.out.println("WTF");
                }
                androidx.constraintlayout.core.ArrayRow arrayRow2 = this.mRows[i2];
                if (arrayRow2 != null && arrayRow2.isSimpleDefinition) {
                    androidx.constraintlayout.core.ArrayRow arrayRow3 = this.mRows[i2];
                    arrayRow3.variable.setFinalValue(this, arrayRow3.constantValue);
                    if (OPTIMIZED_ENGINE) {
                        this.mCache.optimizedArrayRowPool.release(arrayRow3);
                    } else {
                        this.mCache.arrayRowPool.release(arrayRow3);
                    }
                    this.mRows[i2] = null;
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (true) {
                        i = this.mNumRows;
                        if (i3 >= i) {
                            break;
                        }
                        androidx.constraintlayout.core.ArrayRow[] arrayRowArr = this.mRows;
                        int i5 = i3 - 1;
                        androidx.constraintlayout.core.ArrayRow arrayRow4 = arrayRowArr[i3];
                        arrayRowArr[i5] = arrayRow4;
                        if (arrayRow4.variable.definitionId == i3) {
                            this.mRows[i5].variable.definitionId = i5;
                        }
                        i4 = i3;
                        i3++;
                    }
                    if (i4 < i) {
                        this.mRows[i4] = null;
                    }
                    this.mNumRows = i - 1;
                    i2--;
                }
                i2++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    public void removeRow(androidx.constraintlayout.core.ArrayRow arrayRow) {
        int i;
        if (!arrayRow.isSimpleDefinition || arrayRow.variable == null) {
            return;
        }
        if (arrayRow.variable.definitionId != -1) {
            int i2 = arrayRow.variable.definitionId;
            while (true) {
                i = this.mNumRows;
                if (i2 >= i - 1) {
                    break;
                }
                int i3 = i2 + 1;
                androidx.constraintlayout.core.SolverVariable solverVariable = this.mRows[i3].variable;
                if (solverVariable.definitionId == i3) {
                    solverVariable.definitionId = i2;
                }
                androidx.constraintlayout.core.ArrayRow[] arrayRowArr = this.mRows;
                arrayRowArr[i2] = arrayRowArr[i3];
                i2 = i3;
            }
            this.mNumRows = i - 1;
        }
        if (!arrayRow.variable.isFinalValue) {
            arrayRow.variable.setFinalValue(this, arrayRow.constantValue);
        }
        if (OPTIMIZED_ENGINE) {
            this.mCache.optimizedArrayRowPool.release(arrayRow);
        } else {
            this.mCache.arrayRowPool.release(arrayRow);
        }
    }

    private final int optimize(androidx.constraintlayout.core.LinearSystem.Row row, boolean z) {
        androidx.constraintlayout.core.Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i = 0; i < this.mNumColumns; i++) {
            this.mAlreadyTestedCandidates[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i2++;
            if (i2 >= this.mNumColumns * 2) {
                return i2;
            }
            if (row.getKey() != null) {
                this.mAlreadyTestedCandidates[row.getKey().id] = true;
            }
            androidx.constraintlayout.core.SolverVariable pivotCandidate = row.getPivotCandidate(this, this.mAlreadyTestedCandidates);
            if (pivotCandidate != null) {
                if (this.mAlreadyTestedCandidates[pivotCandidate.id]) {
                    return i2;
                }
                this.mAlreadyTestedCandidates[pivotCandidate.id] = true;
            }
            if (pivotCandidate != null) {
                float f = Float.MAX_VALUE;
                int i3 = -1;
                for (int i4 = 0; i4 < this.mNumRows; i4++) {
                    androidx.constraintlayout.core.ArrayRow arrayRow = this.mRows[i4];
                    if (arrayRow.variable.mType != androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED && !arrayRow.isSimpleDefinition && arrayRow.hasVariable(pivotCandidate)) {
                        float f2 = arrayRow.variables.get(pivotCandidate);
                        if (f2 < 0.0f) {
                            float f3 = (-arrayRow.constantValue) / f2;
                            if (f3 < f) {
                                i3 = i4;
                                f = f3;
                            }
                        }
                    }
                }
                if (i3 > -1) {
                    androidx.constraintlayout.core.ArrayRow arrayRow2 = this.mRows[i3];
                    arrayRow2.variable.definitionId = -1;
                    androidx.constraintlayout.core.Metrics metrics3 = sMetrics;
                    if (metrics3 != null) {
                        metrics3.pivots++;
                    }
                    arrayRow2.pivot(pivotCandidate);
                    arrayRow2.variable.definitionId = i3;
                    arrayRow2.variable.updateReferencesWithNewDefinition(this, arrayRow2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    private int enforceBFS(androidx.constraintlayout.core.LinearSystem.Row row) throws java.lang.Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.mNumRows) {
                z = false;
                break;
            }
            if (this.mRows[i].variable.mType != androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED && this.mRows[i].constantValue < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            androidx.constraintlayout.core.Metrics metrics = sMetrics;
            if (metrics != null) {
                metrics.bfs++;
            }
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.mNumRows; i6++) {
                androidx.constraintlayout.core.ArrayRow arrayRow = this.mRows[i6];
                if (arrayRow.variable.mType != androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED && !arrayRow.isSimpleDefinition && arrayRow.constantValue < 0.0f) {
                    int i7 = 9;
                    if (SKIP_COLUMNS) {
                        int currentSize = arrayRow.variables.getCurrentSize();
                        int i8 = 0;
                        while (i8 < currentSize) {
                            androidx.constraintlayout.core.SolverVariable variable = arrayRow.variables.getVariable(i8);
                            float f2 = arrayRow.variables.get(variable);
                            if (f2 > 0.0f) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f3 = variable.strengthVector[i9] / f2;
                                    if ((f3 < f && i9 == i5) || i9 > i5) {
                                        i4 = variable.id;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f3;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.mNumColumns; i10++) {
                            androidx.constraintlayout.core.SolverVariable solverVariable = this.mCache.mIndexedVariables[i10];
                            float f4 = arrayRow.variables.get(solverVariable);
                            if (f4 > 0.0f) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f5 = solverVariable.strengthVector[i11] / f4;
                                    if ((f5 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i5 = i11;
                                        i3 = i6;
                                        f = f5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                androidx.constraintlayout.core.ArrayRow arrayRow2 = this.mRows[i3];
                arrayRow2.variable.definitionId = -1;
                androidx.constraintlayout.core.Metrics metrics2 = sMetrics;
                if (metrics2 != null) {
                    metrics2.pivots++;
                }
                arrayRow2.pivot(this.mCache.mIndexedVariables[i4]);
                arrayRow2.variable.definitionId = i3;
                arrayRow2.variable.updateReferencesWithNewDefinition(this, arrayRow2);
            } else {
                z2 = true;
            }
            if (i2 > this.mNumColumns / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    private void computeValues() {
        for (int i = 0; i < this.mNumRows; i++) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.mRows[i];
            arrayRow.variable.computedValue = arrayRow.constantValue;
        }
    }

    private void displayRows() {
        displaySolverVariables();
        java.lang.String str = "";
        for (int i = 0; i < this.mNumRows; i++) {
            str = (str + this.mRows[i]) + "\n";
        }
        java.lang.System.out.println(str + this.mGoal + "\n");
    }

    public void displayReadableRows() {
        displaySolverVariables();
        java.lang.String str = " num vars " + this.mVariablesID + "\n";
        for (int i = 0; i < this.mVariablesID + 1; i++) {
            androidx.constraintlayout.core.SolverVariable solverVariable = this.mCache.mIndexedVariables[i];
            if (solverVariable != null && solverVariable.isFinalValue) {
                str = str + " $[" + i + "] => " + solverVariable + " = " + solverVariable.computedValue + "\n";
            }
        }
        java.lang.String str2 = str + "\n";
        for (int i2 = 0; i2 < this.mVariablesID + 1; i2++) {
            androidx.constraintlayout.core.SolverVariable solverVariable2 = this.mCache.mIndexedVariables[i2];
            if (solverVariable2 != null && solverVariable2.isSynonym) {
                str2 = str2 + " ~[" + i2 + "] => " + solverVariable2 + " = " + this.mCache.mIndexedVariables[solverVariable2.synonym] + " + " + solverVariable2.synonymDelta + "\n";
            }
        }
        java.lang.String str3 = str2 + "\n\n #  ";
        for (int i3 = 0; i3 < this.mNumRows; i3++) {
            str3 = (str3 + this.mRows[i3].toReadableString()) + "\n #  ";
        }
        if (this.mGoal != null) {
            str3 = str3 + "Goal: " + this.mGoal + "\n";
        }
        java.lang.System.out.println(str3);
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        java.lang.String str = "";
        for (int i = 0; i < this.mNumRows; i++) {
            if (this.mRows[i].variable.mType == androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED) {
                str = (str + this.mRows[i].toReadableString()) + "\n";
            }
        }
        java.lang.System.out.println(str + this.mGoal + "\n");
    }

    public int getMemoryUsed() {
        int iSizeInBytes = 0;
        for (int i = 0; i < this.mNumRows; i++) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.mRows[i];
            if (arrayRow != null) {
                iSizeInBytes += arrayRow.sizeInBytes();
            }
        }
        return iSizeInBytes;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    void displaySystemInformation() {
        int iSizeInBytes = 0;
        for (int i = 0; i < this.TABLE_SIZE; i++) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.mRows[i];
            if (arrayRow != null) {
                iSizeInBytes += arrayRow.sizeInBytes();
            }
        }
        int iSizeInBytes2 = 0;
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            androidx.constraintlayout.core.ArrayRow arrayRow2 = this.mRows[i2];
            if (arrayRow2 != null) {
                iSizeInBytes2 += arrayRow2.sizeInBytes();
            }
        }
        java.io.PrintStream printStream = java.lang.System.out;
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder("Linear System -> Table size: ").append(this.TABLE_SIZE).append(" (");
        int i3 = this.TABLE_SIZE;
        printStream.println(sbAppend.append(getDisplaySize(i3 * i3)).append(") -- row sizes: ").append(getDisplaySize(iSizeInBytes)).append(", actual size: ").append(getDisplaySize(iSizeInBytes2)).append(" rows: ").append(this.mNumRows).append("/").append(this.mMaxRows).append(" cols: ").append(this.mNumColumns).append("/").append(this.mMaxColumns).append(" 0 occupied cells, ").append(getDisplaySize(0)).toString());
    }

    private void displaySolverVariables() {
        java.lang.System.out.println("Display Rows (" + this.mNumRows + "x" + this.mNumColumns + ")\n");
    }

    private java.lang.String getDisplaySize(int i) {
        int i2 = i * 4;
        int i3 = i2 / 1024;
        int i4 = i3 / 1024;
        if (i4 > 0) {
            return "" + i4 + " Mb";
        }
        if (i3 > 0) {
            return "" + i3 + " Kb";
        }
        return "" + i2 + " bytes";
    }

    public androidx.constraintlayout.core.Cache getCache() {
        return this.mCache;
    }

    public void addGreaterThan(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = createRow();
        androidx.constraintlayout.core.SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowGreaterThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        if (i2 != 8) {
            addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addGreaterBarrier(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = createRow();
        androidx.constraintlayout.core.SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowGreaterThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        addConstraint(arrayRowCreateRow);
    }

    public void addLowerThan(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = createRow();
        androidx.constraintlayout.core.SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowLowerThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        if (i2 != 8) {
            addSingleError(arrayRowCreateRow, (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)), i2);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addLowerBarrier(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = createRow();
        androidx.constraintlayout.core.SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowLowerThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i);
        addConstraint(arrayRowCreateRow);
    }

    public void addCentering(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, float f, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4, int i2, int i3) {
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowCentering(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 8) {
            arrayRowCreateRow.addError(this, i3);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addRatio(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.SolverVariable solverVariable3, androidx.constraintlayout.core.SolverVariable solverVariable4, float f, int i) {
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            arrayRowCreateRow.addError(this, i);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addSynonym(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i) {
        if (solverVariable.definitionId == -1 && i == 0) {
            if (solverVariable2.isSynonym) {
                float f = solverVariable2.synonymDelta;
                solverVariable2 = this.mCache.mIndexedVariables[solverVariable2.synonym];
            }
            if (solverVariable.isSynonym) {
                float f2 = solverVariable.synonymDelta;
                androidx.constraintlayout.core.SolverVariable solverVariable3 = this.mCache.mIndexedVariables[solverVariable.synonym];
                return;
            } else {
                solverVariable.setSynonym(this, solverVariable2, 0.0f);
                return;
            }
        }
        addEquality(solverVariable, solverVariable2, i, 8);
    }

    public androidx.constraintlayout.core.ArrayRow addEquality(androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, int i, int i2) {
        if (USE_BASIC_SYNONYMS && i2 == 8 && solverVariable2.isFinalValue && solverVariable.definitionId == -1) {
            solverVariable.setFinalValue(this, solverVariable2.computedValue + i);
            return null;
        }
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowEquals(solverVariable, solverVariable2, i);
        if (i2 != 8) {
            arrayRowCreateRow.addError(this, i2);
        }
        addConstraint(arrayRowCreateRow);
        return arrayRowCreateRow;
    }

    public void addEquality(androidx.constraintlayout.core.SolverVariable solverVariable, int i) {
        if (USE_BASIC_SYNONYMS && solverVariable.definitionId == -1) {
            float f = i;
            solverVariable.setFinalValue(this, f);
            for (int i2 = 0; i2 < this.mVariablesID + 1; i2++) {
                androidx.constraintlayout.core.SolverVariable solverVariable2 = this.mCache.mIndexedVariables[i2];
                if (solverVariable2 != null && solverVariable2.isSynonym && solverVariable2.synonym == solverVariable.id) {
                    solverVariable2.setFinalValue(this, solverVariable2.synonymDelta + f);
                }
            }
            return;
        }
        int i3 = solverVariable.definitionId;
        if (solverVariable.definitionId != -1) {
            androidx.constraintlayout.core.ArrayRow arrayRow = this.mRows[i3];
            if (arrayRow.isSimpleDefinition) {
                arrayRow.constantValue = i;
                return;
            }
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.isSimpleDefinition = true;
                arrayRow.constantValue = i;
                return;
            } else {
                androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = createRow();
                arrayRowCreateRow.createRowEquals(solverVariable, i);
                addConstraint(arrayRowCreateRow);
                return;
            }
        }
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow2 = createRow();
        arrayRowCreateRow2.createRowDefinition(solverVariable, i);
        addConstraint(arrayRowCreateRow2);
    }

    public static androidx.constraintlayout.core.ArrayRow createRowDimensionPercent(androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, float f) {
        return linearSystem.createRow().createRowDimensionPercent(solverVariable, solverVariable2, f);
    }

    public void addCenterPoint(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2, float f, int i) {
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT));
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT));
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT));
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT));
        androidx.constraintlayout.core.SolverVariable solverVariableCreateObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow = createRow();
        double d = f;
        double d2 = i;
        arrayRowCreateRow.createRowWithAngle(solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable8, (float) (java.lang.Math.sin(d) * d2));
        addConstraint(arrayRowCreateRow);
        androidx.constraintlayout.core.ArrayRow arrayRowCreateRow2 = createRow();
        arrayRowCreateRow2.createRowWithAngle(solverVariableCreateObjectVariable, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable7, (float) (java.lang.Math.cos(d) * d2));
        addConstraint(arrayRowCreateRow2);
    }
}
