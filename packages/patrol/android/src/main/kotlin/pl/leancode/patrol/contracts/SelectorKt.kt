// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package pl.leancode.patrol.contracts;

@kotlin.jvm.JvmName("-initializeselector")
public inline fun selector(block: pl.leancode.patrol.contracts.SelectorKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.Selector =
  pl.leancode.patrol.contracts.SelectorKt.Dsl._create(pl.leancode.patrol.contracts.Contracts.Selector.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `patrol.Selector`
 */
public object SelectorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: pl.leancode.patrol.contracts.Contracts.Selector.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.patrol.contracts.Contracts.Selector.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.patrol.contracts.Contracts.Selector = _builder.build()

    /**
     * `optional string text = 1;`
     */
    public var text: kotlin.String
      @JvmName("getText")
      get() = _builder.getText()
      @JvmName("setText")
      set(value) {
        _builder.setText(value)
      }
    /**
     * `optional string text = 1;`
     */
    public fun clearText() {
      _builder.clearText()
    }
    /**
     * `optional string text = 1;`
     * @return Whether the text field is set.
     */
    public fun hasText(): kotlin.Boolean {
      return _builder.hasText()
    }

    /**
     * `optional string textStartsWith = 2;`
     */
    public var textStartsWith: kotlin.String
      @JvmName("getTextStartsWith")
      get() = _builder.getTextStartsWith()
      @JvmName("setTextStartsWith")
      set(value) {
        _builder.setTextStartsWith(value)
      }
    /**
     * `optional string textStartsWith = 2;`
     */
    public fun clearTextStartsWith() {
      _builder.clearTextStartsWith()
    }
    /**
     * `optional string textStartsWith = 2;`
     * @return Whether the textStartsWith field is set.
     */
    public fun hasTextStartsWith(): kotlin.Boolean {
      return _builder.hasTextStartsWith()
    }

    /**
     * `optional string textContains = 3;`
     */
    public var textContains: kotlin.String
      @JvmName("getTextContains")
      get() = _builder.getTextContains()
      @JvmName("setTextContains")
      set(value) {
        _builder.setTextContains(value)
      }
    /**
     * `optional string textContains = 3;`
     */
    public fun clearTextContains() {
      _builder.clearTextContains()
    }
    /**
     * `optional string textContains = 3;`
     * @return Whether the textContains field is set.
     */
    public fun hasTextContains(): kotlin.Boolean {
      return _builder.hasTextContains()
    }

    /**
     * `optional string className = 4;`
     */
    public var className: kotlin.String
      @JvmName("getClassName")
      get() = _builder.getClassName()
      @JvmName("setClassName")
      set(value) {
        _builder.setClassName(value)
      }
    /**
     * `optional string className = 4;`
     */
    public fun clearClassName() {
      _builder.clearClassName()
    }
    /**
     * `optional string className = 4;`
     * @return Whether the className field is set.
     */
    public fun hasClassName(): kotlin.Boolean {
      return _builder.hasClassName()
    }

    /**
     * `optional string contentDescription = 5;`
     */
    public var contentDescription: kotlin.String
      @JvmName("getContentDescription")
      get() = _builder.getContentDescription()
      @JvmName("setContentDescription")
      set(value) {
        _builder.setContentDescription(value)
      }
    /**
     * `optional string contentDescription = 5;`
     */
    public fun clearContentDescription() {
      _builder.clearContentDescription()
    }
    /**
     * `optional string contentDescription = 5;`
     * @return Whether the contentDescription field is set.
     */
    public fun hasContentDescription(): kotlin.Boolean {
      return _builder.hasContentDescription()
    }

    /**
     * `optional string contentDescriptionStartsWith = 6;`
     */
    public var contentDescriptionStartsWith: kotlin.String
      @JvmName("getContentDescriptionStartsWith")
      get() = _builder.getContentDescriptionStartsWith()
      @JvmName("setContentDescriptionStartsWith")
      set(value) {
        _builder.setContentDescriptionStartsWith(value)
      }
    /**
     * `optional string contentDescriptionStartsWith = 6;`
     */
    public fun clearContentDescriptionStartsWith() {
      _builder.clearContentDescriptionStartsWith()
    }
    /**
     * `optional string contentDescriptionStartsWith = 6;`
     * @return Whether the contentDescriptionStartsWith field is set.
     */
    public fun hasContentDescriptionStartsWith(): kotlin.Boolean {
      return _builder.hasContentDescriptionStartsWith()
    }

    /**
     * `optional string contentDescriptionContains = 7;`
     */
    public var contentDescriptionContains: kotlin.String
      @JvmName("getContentDescriptionContains")
      get() = _builder.getContentDescriptionContains()
      @JvmName("setContentDescriptionContains")
      set(value) {
        _builder.setContentDescriptionContains(value)
      }
    /**
     * `optional string contentDescriptionContains = 7;`
     */
    public fun clearContentDescriptionContains() {
      _builder.clearContentDescriptionContains()
    }
    /**
     * `optional string contentDescriptionContains = 7;`
     * @return Whether the contentDescriptionContains field is set.
     */
    public fun hasContentDescriptionContains(): kotlin.Boolean {
      return _builder.hasContentDescriptionContains()
    }

    /**
     * `optional string resourceId = 8;`
     */
    public var resourceId: kotlin.String
      @JvmName("getResourceId")
      get() = _builder.getResourceId()
      @JvmName("setResourceId")
      set(value) {
        _builder.setResourceId(value)
      }
    /**
     * `optional string resourceId = 8;`
     */
    public fun clearResourceId() {
      _builder.clearResourceId()
    }
    /**
     * `optional string resourceId = 8;`
     * @return Whether the resourceId field is set.
     */
    public fun hasResourceId(): kotlin.Boolean {
      return _builder.hasResourceId()
    }

    /**
     * <code>optional uint32 instance = 9;</code>
     */
    public var instance: kotlin.Int
      @JvmName("getInstance")
      get() = _builder.getInstance()
      @JvmName("setInstance")
      set(value) {
        _builder.setInstance(value)
      }
    /**
     * `optional uint32 instance = 9;`
     */
    public fun clearInstance() {
      _builder.clearInstance()
    }
    /**
     * `optional uint32 instance = 9;`
     * @return Whether the instance field is set.
     */
    public fun hasInstance(): kotlin.Boolean {
      return _builder.hasInstance()
    }

    /**
     * <code>optional bool enabled = 10;</code>
     */
    public var enabled: kotlin.Boolean
      @JvmName("getEnabled")
      get() = _builder.getEnabled()
      @JvmName("setEnabled")
      set(value) {
        _builder.setEnabled(value)
      }
    /**
     * `optional bool enabled = 10;`
     */
    public fun clearEnabled() {
      _builder.clearEnabled()
    }
    /**
     * `optional bool enabled = 10;`
     * @return Whether the enabled field is set.
     */
    public fun hasEnabled(): kotlin.Boolean {
      return _builder.hasEnabled()
    }

    /**
     * <code>optional bool focused = 11;</code>
     */
    public var focused: kotlin.Boolean
      @JvmName("getFocused")
      get() = _builder.getFocused()
      @JvmName("setFocused")
      set(value) {
        _builder.setFocused(value)
      }
    /**
     * `optional bool focused = 11;`
     */
    public fun clearFocused() {
      _builder.clearFocused()
    }
    /**
     * `optional bool focused = 11;`
     * @return Whether the focused field is set.
     */
    public fun hasFocused(): kotlin.Boolean {
      return _builder.hasFocused()
    }

    /**
     * `optional string pkg = 12;`
     */
    public var pkg: kotlin.String
      @JvmName("getPkg")
      get() = _builder.getPkg()
      @JvmName("setPkg")
      set(value) {
        _builder.setPkg(value)
      }
    /**
     * `optional string pkg = 12;`
     */
    public fun clearPkg() {
      _builder.clearPkg()
    }
    /**
     * `optional string pkg = 12;`
     * @return Whether the pkg field is set.
     */
    public fun hasPkg(): kotlin.Boolean {
      return _builder.hasPkg()
    }
  }
}
public inline fun pl.leancode.patrol.contracts.Contracts.Selector.copy(block: pl.leancode.patrol.contracts.SelectorKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.Selector =
  pl.leancode.patrol.contracts.SelectorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

