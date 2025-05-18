// 1. Find the position of a card
export function getCardPosition(stack, card) {
  return stack.indexOf(card);
}

// 2. Determine if a card is present
export function doesStackIncludeCard(stack, card) {
  return stack.includes(card);
}

// 3. Determine if each card is even
export function isEachCardEven(stack) {
  return stack.every(card => card % 2 === 0);
}

// 4. Check if the stack contains an odd-value card
export function doesStackIncludeOddCard(stack) {
  return stack.some(card => card % 2 !== 0);
}

// 5. Get the first odd card from the stack
export function getFirstOddCard(stack) {
  return stack.find(card => card % 2 !== 0);
}

// 6. Determine the position of the first card that is even
export function getFirstEvenCardPosition(stack) {
  return stack.findIndex(card => card % 2 === 0);
}
