//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.automatorserver.contracts;

@kotlin.jvm.JvmName("-initializetapOnNotificationRequest")
inline fun tapOnNotificationRequest(block: pl.leancode.automatorserver.contracts.TapOnNotificationRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.TapOnNotificationRequest =
  pl.leancode.automatorserver.contracts.TapOnNotificationRequestKt.Dsl._create(pl.leancode.automatorserver.contracts.Contracts.TapOnNotificationRequest.newBuilder()).apply { block() }._build()
object TapOnNotificationRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: pl.leancode.automatorserver.contracts.Contracts.TapOnNotificationRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.automatorserver.contracts.Contracts.TapOnNotificationRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.automatorserver.contracts.Contracts.TapOnNotificationRequest = _builder.build()

    /**
     * <code>uint32 index = 1;</code>
     */
    var index: kotlin.Int
      @JvmName("getIndex")
      get() = _builder.getIndex()
      @JvmName("setIndex")
      set(value) {
        _builder.setIndex(value)
      }
    /**
     * <code>uint32 index = 1;</code>
     */
    fun clearIndex() {
      _builder.clearIndex()
    }
    /**
     * <code>uint32 index = 1;</code>
     * @return Whether the index field is set.
     */
    fun hasIndex(): kotlin.Boolean {
      return _builder.hasIndex()
    }

    /**
     * <code>.patrol.Selector selector = 2;</code>
     */
    var selector: pl.leancode.automatorserver.contracts.Contracts.Selector
      @JvmName("getSelector")
      get() = _builder.getSelector()
      @JvmName("setSelector")
      set(value) {
        _builder.setSelector(value)
      }
    /**
     * <code>.patrol.Selector selector = 2;</code>
     */
    fun clearSelector() {
      _builder.clearSelector()
    }
    /**
     * <code>.patrol.Selector selector = 2;</code>
     * @return Whether the selector field is set.
     */
    fun hasSelector(): kotlin.Boolean {
      return _builder.hasSelector()
    }
    val findByCase: pl.leancode.automatorserver.contracts.Contracts.TapOnNotificationRequest.FindByCase
      @JvmName("getFindByCase")
      get() = _builder.getFindByCase()

    fun clearFindBy() {
      _builder.clearFindBy()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun pl.leancode.automatorserver.contracts.Contracts.TapOnNotificationRequest.copy(block: pl.leancode.automatorserver.contracts.TapOnNotificationRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.TapOnNotificationRequest =
  pl.leancode.automatorserver.contracts.TapOnNotificationRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val pl.leancode.automatorserver.contracts.Contracts.TapOnNotificationRequestOrBuilder.selectorOrNull: pl.leancode.automatorserver.contracts.Contracts.Selector?
  get() = if (hasSelector()) getSelector() else null
