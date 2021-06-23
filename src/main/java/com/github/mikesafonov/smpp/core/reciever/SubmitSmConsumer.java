package com.github.mikesafonov.smpp.core.reciever;

import com.cloudhopper.smpp.pdu.SubmitSm;

import java.util.function.Consumer;

public interface SubmitSmConsumer extends Consumer<SubmitSm> {
}
