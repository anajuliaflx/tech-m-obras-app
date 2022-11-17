import * as React from 'react';
import Box from '@mui/material/Box';
import Fab from '@mui/material/Fab';
import EditIcon from '@mui/icons-material/Edit';
import DeleteIcon from '@mui/icons-material/Delete';

export default function ActionsButton() {
  return (
    <Box sx={{ '& > :not(style)': { m: 1 } }}>
      <Fab color="primary" aria-label="edit">
        <EditIcon />
      </Fab>
      <Fab color="secondary" aria-label="delete">
        <DeleteIcon />
      </Fab>
    </Box>
  );
}