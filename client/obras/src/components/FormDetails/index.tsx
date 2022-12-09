import react, { useState } from 'react';
import { useFormik } from 'formik';
import { useRouter } from 'next/router';
import * as Yup from 'yup';
import {
  Button,
  Container,
  TextField,
  Box,
  Typography,
  Grid,
} from '@mui/material';
import CircularProgress from '@mui/material/CircularProgress';
import { NewFormData } from './Interface';
import api from '../../api';


export default function NewFormInspection() {
  const [loading, setLoading] = useState<boolean>(false);
  const router = useRouter();
  const { id } = router.query;

  const onSubmit = async (formData: any) => {
    setLoading(true);
    try {
      const { data } = await api.post(`api/obra/${id}`, formData);
      if (data) {
        setLoading(false);
        router.push('/');
      }
    } catch (error) {
      console.log(error);
    }
    setLoading(false);
  };

  const initialValues: NewFormData = {
    tipo: "",
    risco: "",
  };

  const formSchema = Yup.object().shape({
    tipo: Yup.string().required('Digite a tipo'),
    risco: Yup.string().required('Digite o ano da estado!'),
  });

  const formik = useFormik({
    initialValues: initialValues,
    validationSchema: formSchema,
    onSubmit,
  });

  return (
    <Container>
      <Box sx={{
        flexGrow: 1
      }}>
        <form noValidate onSubmit={formik.handleSubmit}>
          <Box sx={{
            display: 'flex',
            alignItems: 'center',
            marginTop: 5,
            marginBottom: 5,
            marginLeft: 7,
          }}>
            <Typography component="h4" variant="h4">
              Adicionar Detalhes da Obra
            </Typography>
          </Box>
          <Grid container spacing={2} columns={12}>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="tipo"
                label="tipo"
                name="tipo"
                autoComplete="tipo"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.tipo}
                error={formik.touched.tipo && Boolean(formik.errors.tipo)}
                helperText={formik.touched.tipo && formik.errors.tipo}
              />
            </Grid>
            <Grid item xs={4}>
              <TextField
                variant="outlined"
                margin="normal"
                fullWidth
                id="risco"
                label="risco"
                name="risco"
                autoComplete="risco"
                autoFocus
                onChange={formik.handleChange}
                value={formik.values.risco}
                error={formik.touched.risco && Boolean(formik.errors.risco)}
                helperText={formik.touched.risco && formik.errors.risco}
              />
            </Grid>
          </Grid>
          <Button
            type="submit"
            size="large"
            variant="contained"
            color="primary"
            disabled={loading && formik.isSubmitting}
          >
            {loading && <CircularProgress />}Salvar
          </Button>
        </form>
      </Box >
    </Container >
  );
}