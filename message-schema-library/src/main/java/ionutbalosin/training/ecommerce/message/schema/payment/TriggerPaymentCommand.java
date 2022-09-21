/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ionutbalosin.training.ecommerce.message.schema.payment;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TriggerPaymentCommand extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6853049871514811393L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TriggerPaymentCommand\",\"namespace\":\"ionutbalosin.training.ecommerce.message.schema.payment\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"userId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"orderId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"amount\",\"type\":\"float\"},{\"name\":\"currency\",\"type\":{\"type\":\"enum\",\"name\":\"PaymentCurrency\",\"symbols\":[\"EUR\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
  }

  private static final BinaryMessageEncoder<TriggerPaymentCommand> ENCODER =
      new BinaryMessageEncoder<TriggerPaymentCommand>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TriggerPaymentCommand> DECODER =
      new BinaryMessageDecoder<TriggerPaymentCommand>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TriggerPaymentCommand> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TriggerPaymentCommand> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TriggerPaymentCommand> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TriggerPaymentCommand>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TriggerPaymentCommand to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TriggerPaymentCommand from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TriggerPaymentCommand instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TriggerPaymentCommand fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID id;
  private java.util.UUID userId;
  private java.util.UUID orderId;
  private java.lang.String description;
  private float amount;
  private ionutbalosin.training.ecommerce.message.schema.payment.PaymentCurrency currency;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TriggerPaymentCommand() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param userId The new value for userId
   * @param orderId The new value for orderId
   * @param description The new value for description
   * @param amount The new value for amount
   * @param currency The new value for currency
   */
  public TriggerPaymentCommand(java.util.UUID id, java.util.UUID userId, java.util.UUID orderId, java.lang.String description, java.lang.Float amount, ionutbalosin.training.ecommerce.message.schema.payment.PaymentCurrency currency) {
    this.id = id;
    this.userId = userId;
    this.orderId = orderId;
    this.description = description;
    this.amount = amount;
    this.currency = currency;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return userId;
    case 2: return orderId;
    case 3: return description;
    case 4: return amount;
    case 5: return currency;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
      new org.apache.avro.Conversions.UUIDConversion(),
      new org.apache.avro.Conversions.UUIDConversion(),
      null,
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.util.UUID)value$; break;
    case 1: userId = (java.util.UUID)value$; break;
    case 2: orderId = (java.util.UUID)value$; break;
    case 3: description = value$ != null ? value$.toString() : null; break;
    case 4: amount = (java.lang.Float)value$; break;
    case 5: currency = (ionutbalosin.training.ecommerce.message.schema.payment.PaymentCurrency)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.util.UUID getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.util.UUID value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.util.UUID getUserId() {
    return userId;
  }


  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.util.UUID value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'orderId' field.
   * @return The value of the 'orderId' field.
   */
  public java.util.UUID getOrderId() {
    return orderId;
  }


  /**
   * Sets the value of the 'orderId' field.
   * @param value the value to set.
   */
  public void setOrderId(java.util.UUID value) {
    this.orderId = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.String getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.String value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public float getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(float value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'currency' field.
   * @return The value of the 'currency' field.
   */
  public ionutbalosin.training.ecommerce.message.schema.payment.PaymentCurrency getCurrency() {
    return currency;
  }


  /**
   * Sets the value of the 'currency' field.
   * @param value the value to set.
   */
  public void setCurrency(ionutbalosin.training.ecommerce.message.schema.payment.PaymentCurrency value) {
    this.currency = value;
  }

  /**
   * Creates a new TriggerPaymentCommand RecordBuilder.
   * @return A new TriggerPaymentCommand RecordBuilder
   */
  public static ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder newBuilder() {
    return new ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder();
  }

  /**
   * Creates a new TriggerPaymentCommand RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TriggerPaymentCommand RecordBuilder
   */
  public static ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder newBuilder(ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder other) {
    if (other == null) {
      return new ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder();
    } else {
      return new ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder(other);
    }
  }

  /**
   * Creates a new TriggerPaymentCommand RecordBuilder by copying an existing TriggerPaymentCommand instance.
   * @param other The existing instance to copy.
   * @return A new TriggerPaymentCommand RecordBuilder
   */
  public static ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder newBuilder(ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand other) {
    if (other == null) {
      return new ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder();
    } else {
      return new ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder(other);
    }
  }

  /**
   * RecordBuilder for TriggerPaymentCommand instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TriggerPaymentCommand>
    implements org.apache.avro.data.RecordBuilder<TriggerPaymentCommand> {

    private java.util.UUID id;
    private java.util.UUID userId;
    private java.util.UUID orderId;
    private java.lang.String description;
    private float amount;
    private ionutbalosin.training.ecommerce.message.schema.payment.PaymentCurrency currency;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.orderId)) {
        this.orderId = data().deepCopy(fields()[2].schema(), other.orderId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.amount)) {
        this.amount = data().deepCopy(fields()[4].schema(), other.amount);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.currency)) {
        this.currency = data().deepCopy(fields()[5].schema(), other.currency);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing TriggerPaymentCommand instance
     * @param other The existing instance to copy.
     */
    private Builder(ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.orderId)) {
        this.orderId = data().deepCopy(fields()[2].schema(), other.orderId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.description)) {
        this.description = data().deepCopy(fields()[3].schema(), other.description);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.amount)) {
        this.amount = data().deepCopy(fields()[4].schema(), other.amount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.currency)) {
        this.currency = data().deepCopy(fields()[5].schema(), other.currency);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.util.UUID getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder setId(java.util.UUID value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.util.UUID getUserId() {
      return userId;
    }


    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder setUserId(java.util.UUID value) {
      validate(fields()[1], value);
      this.userId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderId' field.
      * @return The value.
      */
    public java.util.UUID getOrderId() {
      return orderId;
    }


    /**
      * Sets the value of the 'orderId' field.
      * @param value The value of 'orderId'.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder setOrderId(java.util.UUID value) {
      validate(fields()[2], value);
      this.orderId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'orderId' field has been set.
      * @return True if the 'orderId' field has been set, false otherwise.
      */
    public boolean hasOrderId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'orderId' field.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder clearOrderId() {
      orderId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.String getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder setDescription(java.lang.String value) {
      validate(fields()[3], value);
      this.description = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder clearDescription() {
      description = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public float getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder setAmount(float value) {
      validate(fields()[4], value);
      this.amount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder clearAmount() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'currency' field.
      * @return The value.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.PaymentCurrency getCurrency() {
      return currency;
    }


    /**
      * Sets the value of the 'currency' field.
      * @param value The value of 'currency'.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder setCurrency(ionutbalosin.training.ecommerce.message.schema.payment.PaymentCurrency value) {
      validate(fields()[5], value);
      this.currency = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'currency' field has been set.
      * @return True if the 'currency' field has been set, false otherwise.
      */
    public boolean hasCurrency() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'currency' field.
      * @return This builder.
      */
    public ionutbalosin.training.ecommerce.message.schema.payment.TriggerPaymentCommand.Builder clearCurrency() {
      currency = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TriggerPaymentCommand build() {
      try {
        TriggerPaymentCommand record = new TriggerPaymentCommand();
        record.id = fieldSetFlags()[0] ? this.id : (java.util.UUID) defaultValue(fields()[0]);
        record.userId = fieldSetFlags()[1] ? this.userId : (java.util.UUID) defaultValue(fields()[1]);
        record.orderId = fieldSetFlags()[2] ? this.orderId : (java.util.UUID) defaultValue(fields()[2]);
        record.description = fieldSetFlags()[3] ? this.description : (java.lang.String) defaultValue(fields()[3]);
        record.amount = fieldSetFlags()[4] ? this.amount : (java.lang.Float) defaultValue(fields()[4]);
        record.currency = fieldSetFlags()[5] ? this.currency : (ionutbalosin.training.ecommerce.message.schema.payment.PaymentCurrency) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TriggerPaymentCommand>
    WRITER$ = (org.apache.avro.io.DatumWriter<TriggerPaymentCommand>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TriggerPaymentCommand>
    READER$ = (org.apache.avro.io.DatumReader<TriggerPaymentCommand>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










