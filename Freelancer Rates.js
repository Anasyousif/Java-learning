const hoursPerDay = 8;
const full_month = 22;

export function dayRate(ratePerHour) {
  return hoursPerDay * ratePerHour;
}

export function daysInBudget(budget, ratePerHour) {
  return Math.floor(budget / dayRate(ratePerHour));
}

export function priceWithMonthlyDiscount(ratePerHour, numDays, discount) {
  const fullMonths = Math.floor(numDays / full_month);
  const remainingDays = numDays % full_month;

  const monthlyRate = dayRate(ratePerHour) * full_month;
  const discountedMonthlyRate = monthlyRate * (1 - discount);
  const total = (fullMonths * discountedMonthlyRate) + (remainingDays * dayRate(ratePerHour));

  return Math.ceil(total); // Rounded up to the nearest whole number
}