import React, { useState } from 'react';
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
import Modal from '../Popup';

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

export default function ActionsButton({ deleteFunc }: { deleteFunc: Function}) {
  const [anchorEl, setAnchorEl] = useState<null | HTMLElement>(null);
  const [deleteModal, setDeleteModal] = useState(false);
  const open = Boolean(anchorEl);

  const handleClickOpenMenu = (event: React.MouseEvent<HTMLButtonElement>) => {
    setAnchorEl(event.currentTarget);
  };

  const handleCloseMenu = () => {
    setAnchorEl(null);
  };

  const handleDeleteModalOpen = () => {
    setDeleteModal(true)
  };

  const handleDeleteModalClose = () => {
    setDeleteModal(false)
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
          title='Deletar'
          onClick={handleDeleteModalOpen}
        >
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
          onClick={handleClickOpenMenu}
          color='warning'
          aria-label="menu"
          title='Mais opções'>
          <MoreVertIcon />
        </Fab>
        <Menu
          id="basic-menu"
          anchorEl={anchorEl}
          open={open}
          onClose={handleCloseMenu}
          MenuListProps={{
            'aria-labelledby': 'menu',
          }}
        >
          <MenuItem onClick={handleCloseMenu}>Inspeções</MenuItem>
          <MenuItem onClick={handleCloseMenu}>Localização</MenuItem>
          <MenuItem onClick={handleCloseMenu}>Detalhes tecnicos</MenuItem>
        </Menu>
      </Box>
      <Modal openModal={deleteModal} closeModal={handleDeleteModalClose} handleDelete={deleteFunc} title={'Deseja Deletar?'} />

    </ThemeProvider>
  );
}