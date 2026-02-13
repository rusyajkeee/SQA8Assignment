# Regression Test Suite - Tricentis Demo Web Shop

**Website:** https://demowebshop.tricentis.com  
**Purpose:** Core + risk-based coverage (25–40 test cases)  
**Coverage:** Positive, negative, boundary, cross-browser, responsive

---

## Positive Scenarios

| ID | Test Case | Steps | Expected Result | Pass/Fail |
|----|-----------|-------|-----------------|-----------|
| REG-P01 | Valid search – computer | Search "computer" | Results with computers | |
| REG-P02 | Valid search – laptop | Search "laptop" | Results with laptops | |
| REG-P03 | Add product to cart | Add Blue and green Sneaker | Success message; cart updated | |
| REG-P04 | Add multiple same product | Add Sneaker x2 | Cart shows quantity 2 | |
| REG-P05 | Open product detail | Click 14.1-inch Laptop | Detail page with price and Add to cart | |
| REG-P06 | Sort by price low to high | Go to Books, sort Price: Low to High | Products ordered by price | |
| REG-P07 | Sort by name | Sort by Name: A to Z | Products ordered alphabetically | |
| REG-P08 | Navigate category Computers | Click Computers | Computers page with subcategories | |
| REG-P09 | Subcategory Desktops | Computers > Desktops | Desktop products listed | |
| REG-P10 | Add gift card | Go to $25 Virtual Gift Card, fill required fields, add | Product added to cart | |
| REG-P11 | Community poll – vote | Select "Excellent", click Vote | Poll updates or message shown | |
| REG-P12 | Newsletter signup (valid) | Enter valid email, Subscribe | Subscription confirmation | |

---

## Negative Scenarios (Validation, Incorrect Input)

| ID | Test Case | Steps | Expected Result | Pass/Fail |
|----|-----------|-------|-----------------|-----------|
| REG-N01 | Invalid login – wrong password | Login with valid email + wrong password | Error message; no login | |
| REG-N02 | Invalid login – wrong email | Login with fake@test.com + any password | Error message | |
| REG-N03 | Empty login – no email | Submit login with blank email | Validation error | |
| REG-N04 | Empty login – no password | Submit login with blank password | Validation error | |
| REG-N05 | Empty search | Submit search with blank keyword | Alert or message (e.g. "Please enter search keyword") | |
| REG-N06 | Invalid search – special chars | Search "$$$$" | No results or "No products found" | |
| REG-N07 | Registration – weak password | Register with password "123" | Validation error | |
| REG-N08 | Registration – mismatched password | Register with Password ≠ Confirm | Validation error | |
| REG-N09 | Registration – invalid email | Register with "notanemail" | Validation error | |

---

## Boundary Value Checks

| ID | Test Case | Steps | Expected Result | Pass/Fail |
|----|-----------|-------|-----------------|-----------|
| REG-B01 | Search – single character | Search "a" | Results or "No products found" | |
| REG-B02 | Search – very long string | Search 500+ characters | Handled without crash | |
| REG-B03 | Quantity – zero | Try to add 0 quantity | Validation or default to 1 | |
| REG-B04 | Quantity – large number | Add quantity 999 | Accepted or capped | |
| REG-B05 | Product with options – required fields | Simple Computer, add without selecting Processor | Validation prevents add | |

---

## Cross-Browser Sanity (≥ 2 browsers)

| ID | Test Case | Browser | Steps | Expected Result | Pass/Fail |
|----|-----------|---------|-------|-----------------|-----------|
| REG-X01 | Homepage + search | Chrome | Load home, search "computer" | Same as smoke | |
| REG-X02 | Homepage + search | Firefox (or Edge) | Load home, search "computer" | Same as smoke | |
| REG-X03 | Add to cart | Chrome | Add Sneaker to cart | Success | |
| REG-X04 | Add to cart | Firefox (or Edge) | Add Sneaker to cart | Success | |

---

## Responsive Checks (Desktop + Mobile Viewport)

| ID | Test Case | Viewport | Steps | Expected Result | Pass/Fail |
|----|-----------|----------|-------|-----------------|-----------|
| REG-R01 | Homepage responsive | 1920×1080 | Load home | Layout correct; no horizontal scroll | |
| REG-R02 | Homepage responsive | 375×667 (mobile) | Load home | Mobile layout; navigation usable | |
| REG-R03 | Search on mobile | 375×667 | Search "computer" | Search works; results readable | |
| REG-R04 | Add to cart mobile | 375×667 | Add product to cart | Add to cart works | |
| REG-R05 | Menu/categories mobile | 375×667 | Open categories | Menu accessible; categories open | |

---

## Summary

| Category | Count |
|----------|-------|
| Positive | 12 |
| Negative | 9 |
| Boundary | 5 |
| Cross-Browser | 4 |
| Responsive | 5 |
| **Total** | **35** |
