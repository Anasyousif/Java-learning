export function onGuestList(guestList, formalName) {
    // Extract surname (everything after the honorific)
    const surname = formalName.split(" ").slice(1).join(" ");
  
    // Check if any guest name ends with the same surname
    for (const fullName of guestList) {
      if (fullName.endsWith(surname)) {
        return true;
      }
    }
  
    return false;
  }
  