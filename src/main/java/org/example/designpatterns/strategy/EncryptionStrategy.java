package org.example.designpatterns.strategy;

/**
 * https://springframework.guru/gang-of-four-design-patterns/strategy-pattern/
 *
 */
public interface EncryptionStrategy {
        void encryptData(String plaintext);
}
