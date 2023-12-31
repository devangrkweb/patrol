// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package pl.leancode.patrol.contracts;

@kotlin.jvm.JvmName("-initializedartTestGroup")
public inline fun dartTestGroup(block: pl.leancode.patrol.contracts.DartTestGroupKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.DartTestGroup =
  pl.leancode.patrol.contracts.DartTestGroupKt.Dsl._create(pl.leancode.patrol.contracts.Contracts.DartTestGroup.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `patrol.DartTestGroup`
 */
public object DartTestGroupKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: pl.leancode.patrol.contracts.Contracts.DartTestGroup.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.patrol.contracts.Contracts.DartTestGroup.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.patrol.contracts.Contracts.DartTestGroup = _builder.build()

    /**
     * `string name = 1;`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * `string name = 1;`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class TestsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .patrol.DartTestCase tests = 2;`
     */
     public val tests: com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestCase, TestsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getTestsList()
      )
    /**
     * `repeated .patrol.DartTestCase tests = 2;`
     * @param value The tests to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addTests")
    public fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestCase, TestsProxy>.add(value: pl.leancode.patrol.contracts.Contracts.DartTestCase) {
      _builder.addTests(value)
    }
    /**
     * `repeated .patrol.DartTestCase tests = 2;`
     * @param value The tests to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignTests")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestCase, TestsProxy>.plusAssign(value: pl.leancode.patrol.contracts.Contracts.DartTestCase) {
      add(value)
    }
    /**
     * `repeated .patrol.DartTestCase tests = 2;`
     * @param values The tests to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllTests")
    public fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestCase, TestsProxy>.addAll(values: kotlin.collections.Iterable<pl.leancode.patrol.contracts.Contracts.DartTestCase>) {
      _builder.addAllTests(values)
    }
    /**
     * `repeated .patrol.DartTestCase tests = 2;`
     * @param values The tests to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllTests")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestCase, TestsProxy>.plusAssign(values: kotlin.collections.Iterable<pl.leancode.patrol.contracts.Contracts.DartTestCase>) {
      addAll(values)
    }
    /**
     * `repeated .patrol.DartTestCase tests = 2;`
     * @param index The index to set the value at.
     * @param value The tests to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setTests")
    public operator fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestCase, TestsProxy>.set(index: kotlin.Int, value: pl.leancode.patrol.contracts.Contracts.DartTestCase) {
      _builder.setTests(index, value)
    }
    /**
     * `repeated .patrol.DartTestCase tests = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearTests")
    public fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestCase, TestsProxy>.clear() {
      _builder.clearTests()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class GroupsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .patrol.DartTestGroup groups = 3;`
     */
     public val groups: com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestGroup, GroupsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getGroupsList()
      )
    /**
     * `repeated .patrol.DartTestGroup groups = 3;`
     * @param value The groups to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addGroups")
    public fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestGroup, GroupsProxy>.add(value: pl.leancode.patrol.contracts.Contracts.DartTestGroup) {
      _builder.addGroups(value)
    }
    /**
     * `repeated .patrol.DartTestGroup groups = 3;`
     * @param value The groups to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignGroups")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestGroup, GroupsProxy>.plusAssign(value: pl.leancode.patrol.contracts.Contracts.DartTestGroup) {
      add(value)
    }
    /**
     * `repeated .patrol.DartTestGroup groups = 3;`
     * @param values The groups to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllGroups")
    public fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestGroup, GroupsProxy>.addAll(values: kotlin.collections.Iterable<pl.leancode.patrol.contracts.Contracts.DartTestGroup>) {
      _builder.addAllGroups(values)
    }
    /**
     * `repeated .patrol.DartTestGroup groups = 3;`
     * @param values The groups to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllGroups")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestGroup, GroupsProxy>.plusAssign(values: kotlin.collections.Iterable<pl.leancode.patrol.contracts.Contracts.DartTestGroup>) {
      addAll(values)
    }
    /**
     * `repeated .patrol.DartTestGroup groups = 3;`
     * @param index The index to set the value at.
     * @param value The groups to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setGroups")
    public operator fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestGroup, GroupsProxy>.set(index: kotlin.Int, value: pl.leancode.patrol.contracts.Contracts.DartTestGroup) {
      _builder.setGroups(index, value)
    }
    /**
     * `repeated .patrol.DartTestGroup groups = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearGroups")
    public fun com.google.protobuf.kotlin.DslList<pl.leancode.patrol.contracts.Contracts.DartTestGroup, GroupsProxy>.clear() {
      _builder.clearGroups()
    }
  }
}
public inline fun pl.leancode.patrol.contracts.Contracts.DartTestGroup.copy(block: pl.leancode.patrol.contracts.DartTestGroupKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.DartTestGroup =
  pl.leancode.patrol.contracts.DartTestGroupKt.Dsl._create(this.toBuilder()).apply { block() }._build()

