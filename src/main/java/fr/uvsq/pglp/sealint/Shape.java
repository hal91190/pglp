package fr.uvsq.pglp.sealint;

// tag::sealed-shape[]
public sealed interface Shape permits Circle, Square {
}
// end::sealed-shape[]
