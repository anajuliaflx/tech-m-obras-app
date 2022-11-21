import React from 'react';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import Box from '@mui/material/Box';
import Fab from '@mui/material/Fab';
import Menu from '@mui/material/Menu';
import MenuItem from '@mui/material/MenuItem';
import EditIcon from '@mui/icons-material/Edit';
import DeleteIcon from '@mui/icons-material/Delete';
import MoreVertIcon from '@mui/icons-material/MoreVert';
import InfoIcon from '@mui/icons-material/Info';
import { red, teal, amber, green } from '@mui/material/colors';

const theme = createTheme({
  palette: {
    primary: {
      main: teal[900],
    },
    secondary: {
      main: red[700],
    },
    info: {
      main: amber[500],
    },
    warning: {
      main: green[700],
    },
  },
});

export default function ActionsButton() {
  const [anchorEl, setAnchorEl] = React.useState<null | HTMLElement>(null);
  const open = Boolean(anchorEl);

  const handleClick = (event: React.MouseEvent<HTMLButtonElement>) => {
    setAnchorEl(event.currentTarget);
  };

  const handleClose = () => {
    setAnchorEl(null);
  };

  return (
    <ThemeProvider theme={theme}>
      <Box sx={{ '& > :not(style)': { m: 1 } }}>
        <Fab
          color="primary"
          aria-label="edit"
          title='Editar'
          href='/editConstruction'>
          <EditIcon />
        </Fab>
        <Fab
          color="secondary"
          aria-label="delete"
          title='Deletar'>
          <DeleteIcon />
        </Fab>
        <Fab
          color="info"
          aria-label="viw more"
          title='Ver mais'>
          <InfoIcon />
        </Fab>
        <Fab
          aria-controls={open ? 'basic-menu' : undefined}
          onClick={handleClick}
          color='warning'
          aria-label="menu"
          title='Mais opções'>
          <MoreVertIcon />
        </Fab>
        <Menu
          id="basic-menu"
          anchorEl={anchorEl}
          open={open}
          onClose={handleClose}
          MenuListProps={{
            'aria-labelledby': 'menu',
          }}
        >
          <MenuItem onClick={handleClose}>Inspeções</MenuItem>
          <MenuItem onClick={handleClose}>Localização</MenuItem>
          <MenuItem onClick={handleClose}>Detalhes tecnicos</MenuItem>
        </Menu>
      </Box>
    </ThemeProvider>
  );
}