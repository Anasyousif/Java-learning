const gameArea = document.getElementById("game-area");
const gridSize = 20; // 20x20 grid
const snakeLength = 5;
const boxSize = 5; // 5% of game area per instructions
const spacing = 1; // separation between boxes

// Create the snake segments
const snake = [];
for (let i = 0; i < snakeLength; i++) {
  const segment = document.createElement("div");
  segment.classList.add("snake");
  gameArea.appendChild(segment);
  snake.push(segment);
}

// Define path starting in the middle of the top edge, going counter-clockwise
const path = [];

const startX = Math.floor((gridSize - 2) / 2); // Start in middle (exclude borders)
const topY = 1;
const rightX = gridSize - 2;
const bottomY = gridSize - 2;
const leftX = 1;

// Top edge ← (middle to left, then right to middle)
for (let x = startX; x >= leftX; x--) path.push([x, topY]);
for (let x = rightX; x > startX; x--) path.push([x, topY]);

// Left edge ↓
for (let y = topY + 1; y <= bottomY; y++) path.push([leftX, y]);

// Bottom edge →
for (let x = leftX + 1; x <= rightX; x++) path.push([x, bottomY]);

// Right edge ↑
for (let y = bottomY - 1; y >= topY; y--) path.push([rightX, y]);

let index = 0;

function gameLoop() {
  // Position each segment based on offset from head
  for (let i = 0; i < snake.length; i++) {
    const posIndex = (index - i + path.length) % path.length;
    const [x, y] = path[posIndex];
    snake[i].style.left = `${(x / gridSize) * 100}%`;
    snake[i].style.top = `${(y / gridSize) * 100}%`;
  }

  index = (index + 1) % path.length;

  // Call the loop again with a delay (faster = lower value)
  const speed = 75; // in ms
  setTimeout(() => requestAnimationFrame(gameLoop), speed);
}

requestAnimationFrame(gameLoop);
