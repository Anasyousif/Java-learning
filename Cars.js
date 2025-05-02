export function needsLicense(kind) {
    if (kind=== "car" || kind==="truck") {
      return true; 
    }
    else {
      return false;
    }
  }
  
  
  export function chooseVehicle(option1, option2) {
    const better = option1 < option2 ? option1 : option2;
    return `${better} is clearly the better choice.`;
  }
  
  export function calculateResellPrice(originalPrice, age) {
    if (age <3) {
      return originalPrice * 0.80
    }
    else if (age > 10 ){
      return originalPrice * 0.50
    }
    else {
      return originalPrice * 0.70
    }
  }
  