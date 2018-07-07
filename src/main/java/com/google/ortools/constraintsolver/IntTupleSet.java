/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class IntTupleSet {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IntTupleSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntTupleSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_IntTupleSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntTupleSet(int arity) {
    this(operations_research_constraint_solverJNI.new_IntTupleSet__SWIG_0(arity), true);
  }

  public IntTupleSet(IntTupleSet set) {
    this(operations_research_constraint_solverJNI.new_IntTupleSet__SWIG_1(IntTupleSet.getCPtr(set), set), true);
  }

  public void clear() {
    operations_research_constraint_solverJNI.IntTupleSet_clear(swigCPtr, this);
  }

  public int insert(int[] tuple) {
    return operations_research_constraint_solverJNI.IntTupleSet_insert__SWIG_0(swigCPtr, this, tuple);
  }

  public int insert(long[] tuple) {
    return operations_research_constraint_solverJNI.IntTupleSet_insert__SWIG_1(swigCPtr, this, tuple);
  }

  public int insert2(long v0, long v1) {
    return operations_research_constraint_solverJNI.IntTupleSet_insert2(swigCPtr, this, v0, v1);
  }

  public int insert3(long v0, long v1, long v2) {
    return operations_research_constraint_solverJNI.IntTupleSet_insert3(swigCPtr, this, v0, v1, v2);
  }

  public int insert4(long v0, long v1, long v2, long v3) {
    return operations_research_constraint_solverJNI.IntTupleSet_insert4(swigCPtr, this, v0, v1, v2, v3);
  }

  public void insertAll(long[][] tuples) {
    operations_research_constraint_solverJNI.IntTupleSet_insertAll__SWIG_0(swigCPtr, this, tuples);
  }

  public void insertAll(SWIGTYPE_p_std__vectorT_std__vectorT_int_t_t tuples) {
    operations_research_constraint_solverJNI.IntTupleSet_insertAll__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__vectorT_int_t_t.getCPtr(tuples));
  }

  public boolean contains(int[] tuple) {
    return operations_research_constraint_solverJNI.IntTupleSet_contains__SWIG_0(swigCPtr, this, tuple);
  }

  public boolean contains(long[] tuple) {
    return operations_research_constraint_solverJNI.IntTupleSet_contains__SWIG_1(swigCPtr, this, tuple);
  }

  public int numTuples() {
    return operations_research_constraint_solverJNI.IntTupleSet_numTuples(swigCPtr, this);
  }

  public long value(int tuple_index, int pos_in_tuple) {
    return operations_research_constraint_solverJNI.IntTupleSet_value(swigCPtr, this, tuple_index, pos_in_tuple);
  }

  public int arity() {
    return operations_research_constraint_solverJNI.IntTupleSet_arity(swigCPtr, this);
  }

  public SWIGTYPE_p_long_long rawData() {
    long cPtr = operations_research_constraint_solverJNI.IntTupleSet_rawData(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_long_long(cPtr, false);
  }

  public int NumDifferentValuesInColumn(int col) {
    return operations_research_constraint_solverJNI.IntTupleSet_NumDifferentValuesInColumn(swigCPtr, this, col);
  }

  public IntTupleSet SortedByColumn(int col) {
    return new IntTupleSet(operations_research_constraint_solverJNI.IntTupleSet_SortedByColumn(swigCPtr, this, col), true);
  }

  public IntTupleSet SortedLexicographically() {
    return new IntTupleSet(operations_research_constraint_solverJNI.IntTupleSet_SortedLexicographically(swigCPtr, this), true);
  }

}