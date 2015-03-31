//direct use of TypeConverter
TypeConverter tc = consumer.getEndpoint()
            .getCamelContext().getTypeConverter();
ByteBuffer bodyAsByteBuffer = 
            tc.convertTo(ByteBuffer.class, body);

//automatic trigger under the hood
ByteBuffer bodyAsBuffer = 
            message.getBody(ByteBuffer.class);
