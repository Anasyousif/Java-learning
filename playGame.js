export function playGame() {
  const aliens = getStartingAliens(); // 3 rows of aliens
  const numRows = aliens.length;
  const numCols = aliens[0].length;
  const maxTurns = 100;

  let position = 0; // laser starts at column 0

  for (let turn = 0; turn < maxTurns; turn++) {
    let found = false;

    for (let col = 0; col < numCols; col++) {
      for (let row = 0; row < numRows; row++) {
        if (aliens[row][col]) {
          // Move to the alien's column
          while (position < col) {
            moveRight();
            position++;
          }
          while (position > col) {
            moveLeft();
            position--;
          }

          // Shoot the alien
          shoot();
          aliens[row][col] = false; // mark it as dead

          // Move to cool down the laser
          if (position < numCols - 1) {
            moveRight();
            position++;
            moveLeft();
            position--;
          } else {
            moveLeft();
            position--;
            moveRight();
            position++;
          }

          found = true;
          break;
        }
      }
      if (found) break;
    }

    if (!found) break; // all aliens destroyed
  }
}
