package com.github.mikesafonov.smpp.core.reciever;

import com.cloudhopper.smpp.pdu.DeliverSm;
import java.util.function.Consumer;

public interface DeliverSmConsumer extends Consumer<DeliverSm> {
}
