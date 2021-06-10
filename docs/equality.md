# Equality

* `==` is a reference comparison; it returns `true` if both objects refer to the same memory location
* `equals` is a functional equality comparison
	* It compares whatever its definition requires it to compare
	* If `equals` is undefined for a class, the definition will default to the closest definition in a parent
	* The ultimate parent definition is `Object.equals`
	* `Object.equals` is identical to `==`
* `hashCode` must return the same value for any two objects which are equivalent using `equals`. Therefore, implementing one requires implementing the other.

